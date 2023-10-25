package com.practice.jumpToSpringBoot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter


@Entity
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Long id;

    @Column(length = 255)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column
    private LocalDateTime created_at;

    @OneToMany(mappedBy = "questionEntity",cascade = CascadeType.REMOVE)
    private final List<AnswerEntity> answerEntities = new ArrayList<>();
}
