package com.interviewiq.services;


import com.interviewiq.dto.InterviewResultDTO;
import com.interviewiq.dto.InterviewSubmitDTO;
import com.interviewiq.models.InterviewResult;
import com.interviewiq.models.Question;
import com.interviewiq.models.User;
import com.interviewiq.repositories.InterviewResultRepository;
import com.interviewiq.repositories.QuestionRepository;
import com.interviewiq.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class InterviewService {

    @Autowired
    private InterviewResultRepository interviewResultRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public InterviewResultDTO processAndSaveInterview(InterviewSubmitDTO dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        InterviewResult result = new InterviewResult();
        result.setUser(user);
        result.setRole(dto.getRole());
        result.setTotalQuestions(dto.getTotalQuestions());
        result.setAnsweredQuestions(dto.getAnsweredQuestions());
        result.setSkippedQuestions(dto.getSkippedQuestions());
        result.setAvgResponseTime(dto.getAvgResponseTime());

        // Heatmap and Advanced Scoring Logic
        Map<String, Double> skillScores = new HashMap<>();
        Map<String, Integer> skillCounts = new HashMap<>();
        double totalWeightedScore = 0;
        double maxPossibleWeightedScore = 0;

        if (dto.getAnswers() != null && !dto.getAnswers().isEmpty()) {
            for (InterviewSubmitDTO.AnswerDetail ans : dto.getAnswers()) {
                Question q = questionRepository.findById(ans.getQuestionId()).orElse(null);
                if (q == null) continue;

                String skill = q.getSkill();
                // Simple heuristic if not strictly modeled
                if (skill == null || skill.isEmpty()) skill = "General";
                
                int depthWeight = q.getExpectedAnswerDepth() > 0 ? q.getExpectedAnswerDepth() : 1;
                
                double qScore = ans.getScore(); // From frontend (0-100)
                // Backend adjustments
                if (ans.isSkipped()) qScore = 0;
                
                // Track per skill
                skillScores.put(skill, skillScores.getOrDefault(skill, 0.0) + (qScore * depthWeight));
                skillCounts.put(skill, skillCounts.getOrDefault(skill, 0) + depthWeight);

                totalWeightedScore += (qScore * depthWeight);
                maxPossibleWeightedScore += (100.0 * depthWeight);
            }
        }

        // Normalize skill scores to 100 max
        Map<String, Double> normalizedSkillScores = new HashMap<>();
        for (Map.Entry<String, Double> entry : skillScores.entrySet()) {
            double normalized = entry.getValue() / skillCounts.get(entry.getKey());
            normalizedSkillScores.put(entry.getKey(), Math.round(normalized * 10.0) / 10.0);
        }

        // Save skill breakdown as JSON string manually to avoid Jackson dependency issues
        StringBuilder jsonBuilder = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<String, Double> entry : normalizedSkillScores.entrySet()) {
            if (!first) jsonBuilder.append(",");
            jsonBuilder.append("\"").append(entry.getKey()).append("\":").append(entry.getValue());
            first = false;
        }
        jsonBuilder.append("}");
        result.setSkillBreakdown(jsonBuilder.toString());

        // Final score
        int finalScore = maxPossibleWeightedScore > 0 ? (int) Math.round((totalWeightedScore / maxPossibleWeightedScore) * 100) : 0;
        result.setScore(finalScore);

        // Confidence Logic
        double baseConfidence = finalScore;
        double skipPenalty = (dto.getSkippedQuestions() * 1.0 / dto.getTotalQuestions()) * 40.0;
        double hesitationPenalty = dto.getLongHesitations() * 10.0;
        double fastPenalty = dto.getVeryFastAnswers() * 5.0;

        double confScore = baseConfidence - skipPenalty - hesitationPenalty - fastPenalty;
        if (confScore > 100) confScore = 100;
        if (confScore < 0) confScore = 0;

        result.setConfidenceScore(confScore);

        if (confScore >= 80) result.setConfidenceLevel("High Confidence");
        else if (confScore >= 50) result.setConfidenceLevel("Moderate Confidence");
        else result.setConfidenceLevel("Needs Improvement");

        InterviewResult saved = interviewResultRepository.save(result);
        return convertToDTO(saved);
    }

    public List<InterviewResultDTO> getUserResults(Long userId) {
        return interviewResultRepository.findByUserIdOrderByCreatedAtDesc(userId)
                .stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private InterviewResultDTO convertToDTO(InterviewResult result) {
        InterviewResultDTO dto = new InterviewResultDTO();
        dto.setId(result.getId());
        dto.setRole(result.getRole());
        dto.setScore(result.getScore());
        dto.setTotalQuestions(result.getTotalQuestions());
        dto.setAnsweredQuestions(result.getAnsweredQuestions());
        dto.setSkippedQuestions(result.getSkippedQuestions());
        dto.setAvgResponseTime(result.getAvgResponseTime());
        dto.setConfidenceLevel(result.getConfidenceLevel());
        dto.setConfidenceScore(result.getConfidenceScore());
        dto.setSkillBreakdown(result.getSkillBreakdown());
        dto.setCreatedAt(result.getCreatedAt());
        return dto;
    }
}
