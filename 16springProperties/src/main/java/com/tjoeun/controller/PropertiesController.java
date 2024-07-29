package com.tjoeun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySource("/WEB-INF/properties/test1.properties")
@PropertySource("/WEB-INF/properties/test2.properties")

public class PropertiesController {
	
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;
	
	@Value("${student.name2}")
	private String name2;
	
	@Value("${student.age2}")
	private int age2;
	
	@Value("${female.name3}")
	private String name3;
	
	@Value("${female.age3}")
	private int age3;
	
	@Value("${male.name4}")
	private String name4;
	
	@Value("${male.age4}")
	private int age4;
	
	
	@GetMapping("/propertiesTest")
	public void propertiesTest() {
		
		System.out.println("person.name : " + this.name);
		System.out.println("person.age : " + this.age);
		
		System.out.println("student.name : " + this.name2);
		System.out.println("student.age : " + this.age2);
		
		System.out.println("female.name : " + this.name3);
		System.out.println("female.age : " + this.age3);
		
		System.out.println("male.name : " + this.name4);
		System.out.println("male.age : " + this.age4);
		
	}
	
}
