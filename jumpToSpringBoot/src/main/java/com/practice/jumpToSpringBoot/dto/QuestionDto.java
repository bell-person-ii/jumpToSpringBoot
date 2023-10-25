package com.practice.jumpToSpringBoot.dto;

import com.practice.jumpToSpringBoot.entity.AnswerEntity;
import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class QuestionDto {

    private Long id;
    private String subject;
    private String content;
    private LocalDateTime created_at;
    private List<AnswerEntity> answerEntities = new ArrayList<>();

    //엔티티 -> DTO 생성 함수
    public static QuestionDto createQuestionDto(QuestionEntity questionEntity){
        return new QuestionDto(
                questionEntity.getId(),
                questionEntity.getSubject(),
                questionEntity.getContent(),
                questionEntity.getCreated_at(),
                questionEntity.getAnswerEntities()
        );
    }
}
