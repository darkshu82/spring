package com.tjoeun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {
/*
[post]
원주율과 반지름을 입력하고 circleArea 라는 버튼을 누르면
콘솔창과 화면에 원의 넓이를 출력하는 code 를 작성하세요


[get]
query string 으로 pi=3.14, radius=5 를
request scope 에 올리고 지정한 url pattern으로 된
@GetMapping 이 있는 메소드를 작성하고 콘솔창과 화면에
원의 넓이를 출력하는 code 를 작성하세요
*/
	@RequestMapping(value="/circleArea", method= {RequestMethod.GET, RequestMethod.POST})
	public String circleArea(double pi, double radius, HttpServletRequest request) {
		
		double circleArea = pi * Math.pow(radius, 2);
		System.out.println("원의 넓이 : " + circleArea);
		
		request.setAttribute("circleArea", circleArea);
		
		return "circleArea";
	}
	
	
}
