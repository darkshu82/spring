package com.tjoeun.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.beans.CalculateBmi;
import com.tjoeun.beans.Student;

@Controller
public class TestController {
	
	@GetMapping("/problem01")
	public void problem01() {
    System.out.println("Spring Framework");
	}
	
	@GetMapping("/problem02")
	public void problem02(int[] nums, Model model) {
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10 + nums[i]; 
		}
		System.out.println(Arrays.toString(nums));
		
		model.addAttribute("nums", nums);
	}
	
	@PostMapping("/problem03")
	public void problem03(int[] nums, Model model) {
		  
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10 + nums[i]; 
		} 
		System.out.println(Arrays.toString(nums));
		
		model.addAttribute("nums", nums);
	}
	
	@PostMapping("/problem04")
	public void problem04(double weight, double height, Model model) {
		
		double bmi =  weight / (height * height);
		System.out.printf("체질량지수(BMI) : %.2f %%%n", bmi*100);
		    
		model.addAttribute("bmi", bmi);
				      
	}  
	    
	@PostMapping("/problem05")
	public void problem05(CalculateBmi calculateBmi, HttpServletRequest request) {
		
		double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
		
		calculateBmi.setBmi(weight / (height * height));
		System.out.printf("체질량지수(BMI) : %.2f %%%n", calculateBmi.getBmi() * 100);
		
		request.setAttribute("calculateBmi", calculateBmi);
	}
	
	// model.addAttribute("calculateBmi", calculateBmi) 는 자동으로 동작하므로
	// 이 부분은 작성해도 작성하지 않아도 똑같이 동작함
	@PostMapping("/problem06")
	public void problem06(CalculateBmi calculateBmi) {
		calculateBmi.setBmi(calculateBmi.getWeight() / (calculateBmi.getHeight() * calculateBmi.getHeight()));
		System.out.printf("체질량지수(BMI) : %.2f %%%n", calculateBmi.getBmi() * 100);
	}
	     
	@PostMapping("/problem07")
  public ModelAndView problem07(CalculateBmi calculateBmi, ModelAndView mv) {
		calculateBmi.setBmi(calculateBmi.getWeight() / (calculateBmi.getHeight() * calculateBmi.getHeight()));
		System.out.printf("체질량지수(BMI) : %.2f %%%n", calculateBmi.getBmi() * 100);
		   
  	mv.addObject("calculateBmi", calculateBmi);
  	mv.setViewName("problem07");
  	
  	return mv;
  }
	
	@PostMapping("/problem08")
	public void problem08(int dan, Model model) {
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d%n", dan, i, dan * i);
		}
		model.addAttribute("dan", dan);
	}
	
	@GetMapping("/problem09")
	public void problem09(Student student) {
		System.out.println(student);		
	}
	     
	@PostMapping("/problem10")
	public void problem10(Student student) {
		System.out.println(student);		
	}
              
}
