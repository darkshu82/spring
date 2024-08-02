package com.tjoeun.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.dto.UserDTO;

@Controller
public class HomeContoller {
	/*
	@Resource(name="loginUserDTO")
	private UserDTO loginUserDTO;
	*/
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		/*
		String contextPath = request.getServletContext().getRealPath("/");
		System.out.println("contextPath : " + contextPath);
		System.out.println("loginUserDTO : " + loginUserDTO);
		*/
		return "redirect:/main";
	}
}
