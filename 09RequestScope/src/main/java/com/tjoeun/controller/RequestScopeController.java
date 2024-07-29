package com.tjoeun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.beans.Developer;

@Controller
public class RequestScopeController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		request.setAttribute("name", "이순신");
		
	  // forward:result1 <-request scope에 저장된 data가 유지됨.
		// redirect:result1 <-request scope에 저장된 data가 삭제됨.
		
		// return "forward:result1";
		return "redirect:result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		
		request.setAttribute("address", "종로");
		
		return "forward:/result2";
	}
	
	@GetMapping("/result1")
	public String result(HttpServletRequest request) {
		
		String name = (String)request.getAttribute("name");
		System.out.printf("이름 : %s%n", name);
		
		return "result1";
	}
	
	@GetMapping("/result2")
	public String result1(HttpServletRequest request) {
		
		String address = (String)request.getAttribute("address");
		System.out.printf("주소 : %s%n", address);
		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) {
		
		mv.addObject("hobby", "독서");
		mv.setViewName("forward:/result3");
		
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		
		String hobby = (String)request.getAttribute("hobby");
		System.out.printf("취미 : %s%n", hobby);
		return "result3";
	}
	
	@GetMapping("/test4")
	public String test4(Developer dev) {
		
		dev.setEmpno("2024-01");
		dev.setEname("이순신");
		dev.setAge(46);
		dev.setHeight(192.88);
		dev.setWeight(84.62);
		dev.setJob("장군");
		
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		
		Developer dev = (Developer)request.getAttribute("developer");
		System.out.println("dev : " + dev);
		return "result4";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("employee") Developer dev) {
		
		dev.setEmpno("2024-222");
		dev.setEname("강감찬");
		dev.setAge(72);
		dev.setHeight(176.76);
		dev.setWeight(75.96);
		dev.setJob("장군");
		
		return "forward:/result5";
	}
	   
	@GetMapping("/result5")
	public String result5(HttpServletRequest request) {
		
		Developer employee = (Developer)request.getAttribute("employee");
		System.out.println("employee : " + employee);
		System.out.println("employee.getEname() : " + employee.getEname());
		System.out.println("employee.getJob() : " + employee.getJob());
		
		return "result5";
	}
	
	
}
