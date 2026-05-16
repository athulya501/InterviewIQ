package com.interviewiq.controllers;

import com.interviewiq.dto.InterviewResultDTO;
import com.interviewiq.dto.InterviewSubmitDTO;
import com.interviewiq.dto.QuestionDTO;
import com.interviewiq.services.InterviewService;
import com.interviewiq.services.QuestionService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private InterviewService interviewService;

    // --- Question endpoints (Public) ---
    @GetMapping("/questions/{role}/{difficulty}")
    public ResponseEntity<List<QuestionDTO>> getQuestionsByRoleAndDifficulty(
            @PathVariable String role,
            @PathVariable String difficulty) {
        return ResponseEntity.ok(questionService.getQuestionsByRoleAndDifficulty(role, difficulty));
    }

    // --- Interview endpoints (Protected by AuthFilter) ---
    @PostMapping("/interview/start")
    public ResponseEntity<String> startInterview() {
        return ResponseEntity.ok("Interview session started");
    }

    @PostMapping("/interview/submit")
    public ResponseEntity<InterviewResultDTO> submitInterview(@RequestBody InterviewSubmitDTO request, HttpServletRequest httpRequest) {
        // Enforce that the user submitting is the authenticated user
        Long tokenUserId = (Long) httpRequest.getAttribute("userId");
        if (request.getUserId() == null) request.setUserId(tokenUserId);
        
        return ResponseEntity.ok(interviewService.processAndSaveInterview(request));
    }

    @GetMapping("/interview/results")
    public ResponseEntity<List<InterviewResultDTO>> getUserInterviews(HttpServletRequest httpRequest) {
        Long userId = (Long) httpRequest.getAttribute("userId");
        return ResponseEntity.ok(interviewService.getUserResults(userId));
    }
}
