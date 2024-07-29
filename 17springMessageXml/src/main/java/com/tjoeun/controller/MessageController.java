package com.tjoeun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test1")
	public String test1() {
		
		String name1 = res.getMessage("person.name", null, null);
		String name2 = res.getMessage("student.name", null, null);
		
		int age1 = Integer.parseInt(res.getMessage("person.name", null, null));
		int age2 = Integer.parseInt(res.getMessage("student.name", null, null));
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("age1 : " + age1);
		System.out.println("age2 : " + age2);
		
		return "test1";
	}
	
	
}
