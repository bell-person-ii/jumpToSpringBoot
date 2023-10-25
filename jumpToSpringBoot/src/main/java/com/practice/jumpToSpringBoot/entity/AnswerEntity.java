package com.practice.jumpToSpringBoot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter

@Entity
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_ID")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private QuestionEntity questionEntity;
}
