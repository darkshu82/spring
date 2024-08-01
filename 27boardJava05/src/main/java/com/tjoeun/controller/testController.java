package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

	@GetMapping("/developer")
	public String developer() {
		return "test/developer";
	}
	@GetMapping("/officer")
	public String officer() {
		return "test/officer";
	}
	@GetMapping("/sophomore")
	public String sophomore() {
		return "test/sophomore";
	}
}
