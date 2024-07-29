package com.tjoeun.beans;

import lombok.Data;

@Data
public class student {
	private String name;
	private String address;
	private int age;
	private String[] favoriteSubjects;
}