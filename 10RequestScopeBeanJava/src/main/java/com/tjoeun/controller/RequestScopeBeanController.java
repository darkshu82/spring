package com.tjoeun.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.beans.CollegeStudent;
import com.tjoeun.beans.Member;
import com.tjoeun.beans.Officer;
import com.tjoeun.beans.Student;

@Controller
public class RequestScopeBeanController {
	@Autowired
	Member member;
	
	@Resource(name="sophomore")
	CollegeStudent sophomore;
	
	@Autowired
	Student student;
	
	@Resource(name="policeman")
	Officer policeman;
	
	@GetMapping("/test1")
	public String test1(Model model) {
		System.out.println(this.member);
		
		this.member.setMemberNum("1111");
		this.member.setName("이순신");
		this.member.setId("lee");
		member.setPw("123456");
		member.setPhone("01023569887");
		member.setAddress("서울");
		
		this.sophomore.setMemberNum("123456");
		this.sophomore.setName("양만춘");
		this.sophomore.setId("yang");
		sophomore.setPw("111111");
		sophomore.setPhone("01087542165");
		sophomore.setAddress("안시성");
		
		this.student.setMemberNum("78945");
		this.student.setName("장보고");
		this.student.setId("jang");
		student.setPw("94657");
		student.setPhone("0105481544");
		student.setAddress("청해진");
		
		this.policeman.setMemberNum("25753");
		this.policeman.setName("안중근");
		this.policeman.setId("ahn");
		policeman.setPw("77757");
		policeman.setPhone("01077777777");
		policeman.setAddress("해주시");
		
		System.out.println(member);
		model.addAttribute("member", this.member);
		model.addAttribute("sophomore", this.sophomore);
		model.addAttribute("student", this.student);
		model.addAttribute("policeman", this.policeman);
		
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1() {
		System.out.println("member : " + this.member);
		System.out.println("회원번호 : " + this.member.getMemberNum());
		System.out.println("sophomore : " + this.sophomore);
		System.out.println("student : " + this.student);
		System.out.println("policeman : " + this.policeman);
		return "result1";
	}
	
}
