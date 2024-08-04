package com.tjoeun.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.dto.CollegeStudent;
import com.tjoeun.dto.Member;
import com.tjoeun.dto.Officer;
import com.tjoeun.dto.Student;
import com.tjoeun.dto.User;

@Controller
public class testController {
	
	@Autowired
	private CollegeStudent collegeStudent;
	
	@Autowired
	private Officer officer;
	
	@Resource(name="colleague")
	private Member colleague;
	
	@Resource(name="learner")
	private Student learner;
	
	@GetMapping("/problem01")
	public String problem01(User user) {
		user.setName("이순신");
		user.setId("lee");
		user.setPw("1234");
		user.setPost_number("01023");
		user.setAddress1("서울");
		user.setAddress2("종로");
		
		return "problem01";
	}
	
	@GetMapping("/problem02")
	public String problem02(User user) {
		user.setName("이순신");
		user.setId("lee");
		user.setPw("1234");
		user.setPost_number("01023");
		user.setAddress1("서울");
		user.setAddress2("종로");
		
		return "problem02";
	}
	
	@PostMapping("/result")
	public String result(User user) {
		return "result";
	}
	
	@GetMapping("/problem0301")
	public String problem0301() {
		return "redirect:/redirect";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect";
	}
	
	@GetMapping("/problem0302")
	public String problem0302() {
		return "forward:/forward";
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "forward";                                       
	}
	
	@GetMapping("/problem04")
	public String problem04(Model model) {
		
		model.addAttribute("name", "이순신");
		model.addAttribute("job", "장군님");
		
		return "forward:/result";
	}
	
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	@GetMapping("/problem05")
	public String problem05(Model model) {
		
		collegeStudent.setMemberNum("1");
		collegeStudent.setName("이순신");
		collegeStudent.setId("lee");
		collegeStudent.setPw("1234");
		collegeStudent.setPhone("010-1234-5678");
		collegeStudent.setAddress("서울");
		
		officer.setMemberNum("2");
		officer.setName("강감찬");
		officer.setId("kang");
		officer.setPw("1111");
		officer.setPhone("010-2222-2222");
		officer.setAddress("귀주");
		
		colleague.setMemberNum("3");
		colleague.setName("안중근");
		colleague.setId("ahn");
		colleague.setPw("8282");
		colleague.setPhone("010-1588-5588");
		colleague.setAddress("부산");
		
		learner.setMemberNum("4");
		learner.setName("김구");
		learner.setId("kim");
		learner.setPw("9999");
		learner.setPhone("010-9999-9999");
		learner.setAddress("상해");
		
		model.addAttribute("collegeStudent", collegeStudent);
		model.addAttribute("officer", officer);
		model.addAttribute("colleague", colleague);
		model.addAttribute("learner", learner);
		
		return "result";
	}
	
}
