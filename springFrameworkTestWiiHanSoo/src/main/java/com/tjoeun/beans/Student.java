package com.tjoeun.beans;

import lombok.Data;

@Data
public class Student {
	private String name;
	private String address;
	private int age;
	private String[] favoriteSubjects;
}