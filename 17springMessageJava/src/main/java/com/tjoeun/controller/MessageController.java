package com.tjoeun.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	@GetMapping("/test1")
	public String test1(Model model, Locale locale) {
		
		System.out.println("locale : " + locale);
		
		String name1 = res.getMessage("person.name", null, locale);
		String name2 = res.getMessage("student.name", null, locale);
		
		int age1 = Integer.parseInt(res.getMessage("person.age", null, locale));
		int age2 = Integer.parseInt(res.getMessage("student.age", null, locale));
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("age1 : " + age1);
		System.out.println("age2 : " + age2);
		
		Object[] args = {name1, age1};
		String personInfo = res.getMessage("person.info", args, locale);
		System.out.println("person.info : " + personInfo);
		
		String lang = res.getMessage("language.locale", null, locale) ;
		System.out.println("lang : " + lang);
		
		model.addAttribute("args", args);
		
		return "test1";
	}
	
}
