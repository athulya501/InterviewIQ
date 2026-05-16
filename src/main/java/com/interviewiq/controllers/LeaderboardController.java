package com.interviewiq.controllers;

import com.interviewiq.dto.InterviewResultDTO;
import com.interviewiq.services.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping("/global")
    public ResponseEntity<List<InterviewResultDTO>> getGlobalLeaderboard() {
        return ResponseEntity.ok(leaderboardService.getGlobalLeaderboard());
    }

    @GetMapping("/{role}")
    public ResponseEntity<List<InterviewResultDTO>> getRoleLeaderboard(@PathVariable String role) {
        return ResponseEntity.ok(leaderboardService.getRoleLeaderboard(role));
    }
}
