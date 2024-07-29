package com.tjoeun.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UrlmappingController {
 
	@GetMapping("/problem01")
	public String problem01() {
		System.out.println("Spring Framwork");
		return "problem01";
	}
	@GetMapping("/problem02")
	public String problem02(@RequestParam("nums") List<String> list1) {
		System.out.println("list1 : " + list1);
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(+);
		}
		return "problem02";
	}
	@PostMapping("/problem03")
	public String problem03() {
		
		return "problem03";
	}
	@PostMapping("/problem04")
	public String problem04(double height, double weight, HttpServletRequest request) {
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("체지방 : " + bmi);
		
		request.setAttribute("bmi", bmi);
		
		return "problem04";
	}
	@PostMapping("/problem05")
	public String problem05(double height, double weight, HttpServletRequest request) {
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("체지방 : " + bmi);
		
		request.setAttribute("bmi", bmi);
		
		return "problem05";
	}
	@PostMapping("/problem06")
	public String problem06(double height, double weight, Model model) {
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("체지방 : " + bmi);
		
		model.addAttribute("bmi", bmi);
		
		return "problem06";
	}
	@GetMapping("/problem07")
	public ModelAndView problem07(ModelAndView mv) {
		
		
		
		return "mv";
	}
	@GetMapping("/problem08")
	public String problem08() {
		
		for (int x = 2; x <= 9; x++) {
			System.out.println(x + "단");
			for (int y = 2; y <= 9; y++) {
				System.out.println(x + " x " + y + " = " + x * y);
			}
			
		}
		
		return "problem08";
	}
	@GetMapping("/problem09")
	public String problem09(Student student) {
		System.out.println(student);
		return "problem09";
	}
	@GetMapping("/problem10")
	public String problem10() {
		
		return "problem10";
	}
	
	
	
	
	
	
}
