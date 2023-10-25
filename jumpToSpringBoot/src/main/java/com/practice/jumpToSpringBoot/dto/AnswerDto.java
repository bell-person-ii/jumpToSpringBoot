package com.practice.jumpToSpringBoot.dto;

import com.practice.jumpToSpringBoot.entity.AnswerEntity;
import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class AnswerDto {
    private Long id;
    private String content;
    private LocalDateTime created_at;
    private QuestionEntity questionEntity;


    //엔티티 -> DTO 생성 함수
    public static AnswerDto createAnswerDto(AnswerEntity answerEntity){
        return new AnswerDto(
                answerEntity.getId(),
                answerEntity.getContent(),
                answerEntity.getCreated_at(),
                answerEntity.getQuestionEntity()
        );
    }
}
