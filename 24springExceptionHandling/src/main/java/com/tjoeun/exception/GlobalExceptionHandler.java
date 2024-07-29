package com.tjoeun.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(NullPointerException.class)
	public String arrayException() {
		return "error_page2";
	}
	
	
}
