package com.tjoeun.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@Component
@RequestScope
@Data
public class Officer {
	
	private String memberNum;
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String address;
}
