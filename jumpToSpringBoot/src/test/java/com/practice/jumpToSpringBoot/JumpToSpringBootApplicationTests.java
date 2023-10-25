package com.practice.jumpToSpringBoot;

import com.practice.jumpToSpringBoot.entity.AnswerEntity;
import com.practice.jumpToSpringBoot.entity.QuestionEntity;
import com.practice.jumpToSpringBoot.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class JumpToSpringBootApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa(){

		QuestionEntity q1 = QuestionEntity.builder()
				.subject("스프링 부트 그놈의 DI는 무엇인가요?")
				.content("생성자 없이도 객체가 생기는데 어떻게 그게 가능한건가요?")
				.created_at(LocalDateTime.now())
				.answerEntities(null)
				.build();

		this.questionRepository.save(q1);

	}
}
