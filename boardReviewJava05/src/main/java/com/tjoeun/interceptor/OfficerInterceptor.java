package com.tjoeun.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.dto.Officer;
import com.tjoeun.service.OfficerService;

public class OfficerInterceptor implements HandlerInterceptor{
	
	private OfficerService officerService;
	
	public OfficerInterceptor(OfficerService officerService) {
		this.officerService = officerService;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		List<Officer> officerList = officerService.getOfficerList();
		request.setAttribute("officerList", officerList);
		return true;
	}
	
	
}
