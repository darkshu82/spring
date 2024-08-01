package com.tjoeun.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.dto.UserDTO;

@Controller
@RequestMapping("/user")
public class UserController {
	
  @GetMapping("/login")
  public String login() {
  	return "user/login";
  }
  
  @GetMapping("/join")
  public String join(@ModelAttribute("joinUserDTO") UserDTO joinUserDTO) {
  	return "user/join";
  }
  
  @PostMapping("/join_procedure")
  public String join_procedure(@Valid @ModelAttribute("joinUserDTO") UserDTO joinUserDTO, 
  		                         BindingResult result) {
  	
  	if(result.hasErrors()) {
  		
  		return "user/join";  		
  	}
  	
  	return "user/join_success";
  }
  
  @GetMapping("/modify")
  public String modify() {
  	return "user/modify";
  }
  
  @GetMapping("/logout")
  public String logout() {
  	return "user/logout";
  }
  
}
