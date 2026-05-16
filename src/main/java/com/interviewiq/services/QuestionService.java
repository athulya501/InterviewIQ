package com.interviewiq.services;

import com.interviewiq.dto.QuestionDTO;
import com.interviewiq.models.Question;
import com.interviewiq.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionDTO> getQuestionsByRoleAndDifficulty(String role, String difficulty) {
        List<Question> questions;
        if (difficulty == null || difficulty.isEmpty() || difficulty.equalsIgnoreCase("Any")) {
            questions = questionRepository.findByRole(role);
        } else {
            questions = questionRepository.findByRoleAndDifficulty(role, difficulty);
        }
        return questions.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private QuestionDTO convertToDTO(Question q) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(q.getId());
        dto.setRole(q.getRole());
        dto.setDifficulty(q.getDifficulty());
        dto.setTopic(q.getTopic());
        dto.setQuestionText(q.getQuestionText());
        return dto;
    }
}
