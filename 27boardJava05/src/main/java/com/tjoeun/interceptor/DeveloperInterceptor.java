package com.tjoeun.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.beans.Developer;
import com.tjoeun.service.DeveloperService;

public class DeveloperInterceptor implements HandlerInterceptor{
	
	private DeveloperService developerService;
	
	public DeveloperInterceptor(DeveloperService developerService) {
    this.developerService = developerService;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		List<Developer> developerList = developerService.selectAll();
		request.setAttribute("developerList", developerList);
		return true;
	}
	
	
}