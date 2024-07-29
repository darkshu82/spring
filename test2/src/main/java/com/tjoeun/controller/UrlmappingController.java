package com.tjoeun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.style.DefaultValueStyler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tjoeun.beans.Service;

@Controller
public class UrlmappingController {
//	/hello 라는 URL 패턴으로 매핑된 메소드를 작성하고, 
//	해당 메소드에서 "Hello, Spring!" 문자열을 반환하세요.
	
	@GetMapping("/hello")
	public String hello() {
		String hello = "Hello, Spring!";
		System.out.println(hello);
		return "hello";
	}
	
//	GET과 POST 요청을 모두 처리할 수 있는 /greet 라는 URL 패턴으로 
//	매핑된 메소드를 작성하고, 요청 방식에 따라 다른 메시지를 반환하세요.
	
	@RequestMapping(value="/greet", method={ RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String greet(HttpServletRequest request) {
		if(request.getMethod().equalsIgnoreCase("get")) {
			return "greet GET";
		} else if(request.getMethod().equalsIgnoreCase("post")) {
			return "greet POST";
		}
		
		return "request method!";
	}
	
// GET 요청으로 name 파라미터를 받아서, 화면에 "Hello, {name}"를 출력하는 코드를 작성하세요.
	
	@GetMapping("/hello2")
	public String hello2(String name, HttpServletRequest request) {
		
		System.out.println(name);
		
		request.setAttribute("name", name);
		
		return "hello2";
	}
//	빈으로 등록된 Service 클래스를 사용하여, /service 라는 URL 패턴으로 
//	매핑된 메소드에서 Service 클래스의 메소드를 호출하여 결과를 
//	화면에 출력하는 코드를 작성하세요.
	
	@GetMapping("/service")
	public String service(@RequestParam(defaultValue="네이버") String name, 
												@RequestParam(defaultValue="인터넷") String dname) {
		
		Service<String> service = new Service<>();
		
		service.setAttribute("name", name);
		service.setAttribute("dname", dname);;
		
		System.out.println(service.name);
		
		return "service";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
