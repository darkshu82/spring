package com.tjoeun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.tjoeun.dto.CollegeStudent;
import com.tjoeun.dto.Member;

// project 작업할 때 생성하는 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
		
	@Bean("colleague")
	@RequestScope
	public Member member() {
		return new Member();
	}
	
	@Bean
	@RequestScope
	public CollegeStudent CollegeStudent() {
		return new CollegeStudent();
	}
	


}
