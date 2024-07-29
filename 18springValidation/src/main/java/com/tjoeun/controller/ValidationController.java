package com.tjoeun.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.dto.Developer;

@Controller
public class ValidationController {
	
	@PostMapping("/validation_procedure")
	public String validation_procedure(@Valid Developer developer,
			                                BindingResult result) {
		
		System.out.println("developer : " + developer);
		System.out.println("result    : " + result);
		
		/*
		  	@Size(min=2, max=4)
        private String name;
      	
      	@Min(20) @Max(150)
        private int age;
        
        위와 같이 유효성 검사 조건을 설정한 후,
        조건에 위배되게 값을 입력한 경우
        
		result    : org.springframework.validation.BeanPropertyBindingResult
		          : 2 errors
    Field error in object 'developer' on field 'age'
              : rejected value [300]; 
              codes [Max.developer.age,Max.age,Max.int,Max]; 
              arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [developer.age,age]; arguments []; 
              default message [age],150]; default message [150 이하여야 합니다]
    Field error in object 'developer' on field 'name'
              : rejected value [더조은학원]; 
              codes [Size.developer.name,Size.name,Size.java.lang.String,Size];
              arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [developer.name,name]; arguments []; 
              default message [name],4,2]; default message [크기가 2에서 4 사이여야 합니다]
		*/
		System.out.println("---------------------------------------------------");
		
		if(result.hasErrors()) {
			// 유효성 위반 결과들 출력하기
			for(ObjectError error : result.getAllErrors()) {
				System.out.println("에러 메세지 : " + error.getDefaultMessage());
				System.out.println("에러 코드   : " + error.getCode());
				System.out.println("에러 객체   : " + error.getObjectName());
				
				String[] codes = error.getCodes();
				for(String code : codes) {
					System.out.println(code);
				}
				
				if(codes[0].equals("Max.developer.age")) {
					System.out.println("나이는 20살에서 150살 사이여야 합니다");
				} else if(codes[0].equals("Min.developer.age")) {
					System.out.println("나이는 20살에서 150살 사이여야 합니다");
				} else if(codes[0].equals("Size.developer.name")) {
					System.out.println("이름은 2글자에서 4글자 사이여야 합니다");
				}
				
				System.out.println("---------------------------------------------------");
			}
			 
			return "validation_test1";
		}
		
		return "validation_result";
	}
	
	       
	@GetMapping("/validation_test1")
	public String validation_test1() {
		
		return "validation_test1";
	}
	

}
