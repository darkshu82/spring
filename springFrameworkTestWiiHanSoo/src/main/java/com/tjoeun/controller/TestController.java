package com.tjoeun.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.beans.CalculateBmi;
import com.tjoeun.beans.Student;

@Controller
public class TestController {
 
	@GetMapping("/problem01")
	@ResponseBody
	public String problem01() {
		return "Spring Framework";
	}
	
	@GetMapping("/problem02")
	@ResponseBody
	public String problem02(@RequestParam("nums") int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10 + nums[i];
		}
		
		System.out.println(Arrays.toString(nums));
		return Arrays.toString(nums);
	}
	
	@PostMapping("/problem03")
	@ResponseBody
	public String problem03(@RequestParam("nums") int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10 + nums[i];
		}
		
		System.out.println(Arrays.toString(nums));
		return Arrays.toString(nums);
	}
	
	@PostMapping("/problem04")
	public String problem04(double height, double weight, Model model) {
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("bmi : " + bmi * 10000);
		
		model.addAttribute("bmi", bmi);
		
		return "bmiResult";
	}
	
	@PostMapping("/problem05")
	public String problem05(CalculateBmi calculateBmi, HttpServletRequest request) {
		
		double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
		
		calculateBmi.setBmi(weight / Math.pow(height, 2));
		System.out.println("BMI : " + calculateBmi.getBmi() * 10000);
		
		request.setAttribute("calculateBmi", calculateBmi);
		
		return "bmiResult";
	}
	
	@PostMapping("/problem06")
	public String problem06(CalculateBmi calculateBmi) {
		
		double weight = calculateBmi.getWeight();
		double height = calculateBmi.getHeight();
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("체지방 : " + calculateBmi);
		return "bmiResult";
	}
	
	@GetMapping("/problem07")
	public ModelAndView problem07(CalculateBmi calculateBmi, ModelAndView mv) {
		
		double weight = calculateBmi.getWeight();
		double height = calculateBmi.getHeight();
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("체지방 : " + bmi);
		
		mv.addObject("calculateBmi", calculateBmi);
  	mv.setViewName("bmiResult");
		
		return mv;
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
	public void problem09(Student student) {
		System.out.println(student);		
	}
	
	@PostMapping("/problem10")
	public void problem10(Student student) {
		System.out.println(student);		
	}
	
}
