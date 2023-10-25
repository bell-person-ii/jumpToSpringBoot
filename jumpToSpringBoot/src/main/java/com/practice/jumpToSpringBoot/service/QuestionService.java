package com.practice.jumpToSpringBoot.service;

import com.practice.jumpToSpringBoot.dto.QuestionDto;
import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import com.practice.jumpToSpringBoot.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public List<QuestionEntity> index(){
        return questionRepository.findAll();
    }

    public QuestionDto show_question_detail(Long id){
        QuestionEntity questionEntity = questionRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("글 조회 실패 대상 게시글이 없습니다."));
        QuestionDto questionDto = QuestionDto.createQuestionDto(questionEntity);
        return questionDto;

    }
}
