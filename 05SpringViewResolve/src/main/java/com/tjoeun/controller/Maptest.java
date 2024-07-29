package com.tjoeun.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptest {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "자바");
		map1.put(2, "파이썬");
		map1.put(3, "오라클");
		
		map1.forEach((key, value) -> System.out.println(key + " : "+ value));
		
		map1.put(4, "HTML");
		map1.forEach((key, value) -> System.out.println(key + " : "+ value));
		
		map1.put(2, "Spring Framework");
		map1.forEach((key, value) -> System.out.println(key + " : "+ value));
		
		for(Entry<Integer, String> es : map1.entrySet()) {
			System.out.println(es.getKey()+ " + " + es.getValue());
		}
		System.out.println("========================================");
		
		Set<Integer> keySet = map1.keySet();
		for(Integer key : keySet) {
			System.out.println(key + " + " + map1.get(key));
		}
		System.out.println("========================================");
		
		
		
	}
	
}
