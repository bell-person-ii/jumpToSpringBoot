package com.practice.jumpToSpringBoot.repository;

import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity,Long> {
}
