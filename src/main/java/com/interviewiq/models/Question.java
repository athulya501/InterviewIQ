package com.interviewiq.models;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role; // e.g., 'Java Developer', 'Frontend Developer'

    @Column(nullable = false)
    private String difficulty; // Easy, Intermediate, Hard

    @Column(nullable = false)
    private String topic;

    @Column(nullable = false)
    private String skill; // e.g., 'OOP', 'SQL', 'React'

    @Column(nullable = false)
    private int expectedAnswerDepth; // Weight factor 1 to 3

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;

    public Question() {}

    public Question(String role, String difficulty, String topic, String skill, int expectedAnswerDepth, String questionText) {
        this.role = role;
        this.difficulty = difficulty;
        this.topic = topic;
        this.skill = skill;
        this.expectedAnswerDepth = expectedAnswerDepth;
        this.questionText = questionText;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }
    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }
    public int getExpectedAnswerDepth() { return expectedAnswerDepth; }
    public void setExpectedAnswerDepth(int expectedAnswerDepth) { this.expectedAnswerDepth = expectedAnswerDepth; }
    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }
}
