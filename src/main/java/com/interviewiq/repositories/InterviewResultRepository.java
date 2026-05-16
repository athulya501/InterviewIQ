package com.interviewiq.repositories;

import com.interviewiq.models.InterviewResult;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InterviewResultRepository extends JpaRepository<InterviewResult, Long> {
    List<InterviewResult> findByUserIdOrderByCreatedAtDesc(Long userId);
}
