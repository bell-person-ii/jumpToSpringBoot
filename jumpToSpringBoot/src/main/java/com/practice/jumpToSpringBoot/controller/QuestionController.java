package com.practice.jumpToSpringBoot.controller;

import com.practice.jumpToSpringBoot.dto.QuestionDto;
import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import com.practice.jumpToSpringBoot.repository.QuestionRepository;
import com.practice.jumpToSpringBoot.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    private QuestionRepository questionRepository;

    //질문 전체 조회
    @GetMapping("/question/list")
    public String questionList(Model model){
        List<QuestionEntity> questionEntities = questionService.index();
        model.addAttribute("questionEntityList",questionEntities);
        return "question_list";
    }

    //id 질문 조회
    @GetMapping("question/detail/{id}")
    public String questionDetail(@PathVariable Long id,Model model){
        QuestionDto questionDto = questionService.show_question_detail(id);
        if(questionDto != null){
            model.addAttribute("question_detail",questionDto);
            return "question_detail";
        }
        else{
            return "question_list";
        }
    }
}
