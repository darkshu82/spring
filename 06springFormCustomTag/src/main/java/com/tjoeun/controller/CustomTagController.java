package com.tjoeun.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.beans.Member;

@Controller
public class CustomTagController {

	@GetMapping("/test1")
	public String test1(Member member) {
		
		member.setUser_name("이순신");
		member.setUser_id("lee");
		member.setUser_pw("1234");
		member.setUser_postcode("01023");
		member.setUser_address1("서울");
		member.setUser_address2("서울");
		
		System.out.println("member" + member);
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(Member member) {
		
		member.setUser_name("이순신");
  	member.setUser_id("lee");
  	member.setUser_pw("1234");
  	member.setUser_postcode("01023");
  	member.setUser_address1("서울");
  	member.setUser_address2("서울");
		
		System.out.println("member" + member);
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute("user") Member member) {
		
		member.setUser_name("이순신");
  	member.setUser_id("lee");
  	member.setUser_pw("1234");
  	member.setUser_postcode("01023");
  	member.setUser_address1("서울");
  	member.setUser_address2("서울");
		
		System.out.println("member" + member);
		
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(Member member, Model model) {
		
		member.setUser_name("이순신");
  	member.setUser_id("lee");
  	member.setUser_pw("1234");
  	member.setUser_postcode("01023");
  	member.setUser_address1("서울");
  	member.setUser_address2("서울");
		
		System.out.println("member" + member);
		
		model.addAttribute("student", member);
		
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5(Member member, Model model) {
		
		member.setUser_name("이순신");
		member.setUser_id("lee");
		member.setUser_pw("1234");
		member.setUser_postcode("01023");
		member.setUser_address1("서울");
		member.setUser_address2("서울");
		
		System.out.println("member" + member);
		
		model.addAttribute("student", member);
		
		return "test5";
	}
	
	
	@PostMapping("/result")
	public String result(Member member) {
		return "result";
	}
	
}
