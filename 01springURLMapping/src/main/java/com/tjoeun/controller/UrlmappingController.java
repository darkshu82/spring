package com.tjoeun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlmappingController {
 
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/abc")
	public String abc() {
		return "abc";
	}
	
	@PostMapping("/abc")
	public String post(String name, String address, HttpServletRequest request) {
		
//		String name = request.getParameter("name");
//		String address = request.getParameter("address");
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		System.out.println("post 방식으로 이동하기");
		return "post";
	}
	
	@GetMapping("/tjoeun")
	public void tjoeun() { }
	
	@GetMapping("/tjoeun/test2")
	public String tjoeunTest2() {
		return "tjoeun/test2";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
	
	
	
	
}
