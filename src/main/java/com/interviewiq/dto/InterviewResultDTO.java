package com.interviewiq.dto;

import java.time.LocalDateTime;

public class InterviewResultDTO {
    private Long id;
    private String role;
    private int score;
    private int totalQuestions;
    private int answeredQuestions;
    private int skippedQuestions;
    private double avgResponseTime;
    private String confidenceLevel;
    private double confidenceScore;
    private String skillBreakdown;
    private LocalDateTime createdAt;

    public InterviewResultDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getTotalQuestions() { return totalQuestions; }
    public void setTotalQuestions(int totalQuestions) { this.totalQuestions = totalQuestions; }
    public int getAnsweredQuestions() { return answeredQuestions; }
    public void setAnsweredQuestions(int answeredQuestions) { this.answeredQuestions = answeredQuestions; }
    public int getSkippedQuestions() { return skippedQuestions; }
    public void setSkippedQuestions(int skippedQuestions) { this.skippedQuestions = skippedQuestions; }
    public double getAvgResponseTime() { return avgResponseTime; }
    public void setAvgResponseTime(double avgResponseTime) { this.avgResponseTime = avgResponseTime; }
    public String getConfidenceLevel() { return confidenceLevel; }
    public void setConfidenceLevel(String confidenceLevel) { this.confidenceLevel = confidenceLevel; }
    public double getConfidenceScore() { return confidenceScore; }
    public void setConfidenceScore(double confidenceScore) { this.confidenceScore = confidenceScore; }
    public String getSkillBreakdown() { return skillBreakdown; }
    public void setSkillBreakdown(String skillBreakdown) { this.skillBreakdown = skillBreakdown; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
