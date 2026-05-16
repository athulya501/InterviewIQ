package com.interviewiq.repositories;

import com.interviewiq.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByRole(String role);
    List<Question> findByRoleAndDifficulty(String role, String difficulty);
}
