package com.practice.jumpToSpringBoot.repository;

import com.practice.jumpToSpringBoot.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity,Long> {
}
