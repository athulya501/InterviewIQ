package com.interviewiq.services;

import com.interviewiq.dto.InterviewResultDTO;
import com.interviewiq.models.InterviewResult;
import com.interviewiq.repositories.InterviewResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaderboardService {

    @Autowired
    private InterviewResultRepository interviewResultRepository;

    public List<InterviewResultDTO> getGlobalLeaderboard() {
        // Simple mock query using stream for global top 10. In production use custom JPA query ordered by score DESC.
        List<InterviewResult> all = interviewResultRepository.findAll();
        return all.stream()
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .limit(10)
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<InterviewResultDTO> getRoleLeaderboard(String role) {
        List<InterviewResult> all = interviewResultRepository.findAll();
        return all.stream()
                .filter(r -> role.equals(r.getRole()))
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .limit(10)
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private InterviewResultDTO convertToDTO(InterviewResult result) {
        InterviewResultDTO dto = new InterviewResultDTO();
        // Return username instead of ID for leaderboard display
        dto.setRole(result.getUser().getUsername()); // HACK: reusing role field to send username to frontend easily for leaderboard
        dto.setScore(result.getScore());
        dto.setConfidenceLevel(result.getConfidenceLevel());
        return dto;
    }
}
