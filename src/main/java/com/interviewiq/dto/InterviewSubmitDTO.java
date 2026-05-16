package com.interviewiq.dto;

import java.util.List;

public class InterviewSubmitDTO {
    private Long userId;
    private String role;
    private int score;
    private int totalQuestions;
    private int answeredQuestions;
    private int skippedQuestions;
    private double avgResponseTime;
    
    // Additional metrics for confidence calculation
    private int longHesitations;
    private int veryFastAnswers;

    private List<AnswerDetail> answers;

    public InterviewSubmitDTO() {}

    public static class AnswerDetail {
        private Long questionId;
        private int timeSpent;
        private boolean skipped;
        private int wordCount;
        private int score; // Provided by frontend heuristics

        // Getters and Setters
        public Long getQuestionId() { return questionId; }
        public void setQuestionId(Long questionId) { this.questionId = questionId; }
        public int getTimeSpent() { return timeSpent; }
        public void setTimeSpent(int timeSpent) { this.timeSpent = timeSpent; }
        public boolean isSkipped() { return skipped; }
        public void setSkipped(boolean skipped) { this.skipped = skipped; }
        public int getWordCount() { return wordCount; }
        public void setWordCount(int wordCount) { this.wordCount = wordCount; }
        public int getScore() { return score; }
        public void setScore(int score) { this.score = score; }
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
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
    public int getLongHesitations() { return longHesitations; }
    public void setLongHesitations(int longHesitations) { this.longHesitations = longHesitations; }
    public int getVeryFastAnswers() { return veryFastAnswers; }
    public void setVeryFastAnswers(int veryFastAnswers) { this.veryFastAnswers = veryFastAnswers; }
    public List<AnswerDetail> getAnswers() { return answers; }
    public void setAnswers(List<AnswerDetail> answers) { this.answers = answers; }
}
