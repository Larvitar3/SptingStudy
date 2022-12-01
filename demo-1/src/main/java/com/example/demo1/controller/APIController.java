package com.example.demo1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.UserDTO;

@RestController()
@RequestMapping("/api")
public class APIController {

	// 시나리오
	// REST API CLIENT
	// { "name" : "이지은" , "age" : 27 }
	// http://localhost:8080/api/post
	@PostMapping("/post")
	public String post1(@RequestBody Map<String, Object> reqBody) {
		StringBuffer stringBuffer = new StringBuffer();
		
		reqBody.entrySet().forEach(e -> {
			System.out.println("key : " + e.getKey());
			System.out.println("value : " + e.getValue());
			stringBuffer.append(e.getKey() +" : " + e.getValue()+ "\n");
		});
		return stringBuffer.toString();
	}
	
	@PostMapping("/post2")
	public String post2 (@RequestBody UserDTO user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getPhoneNumber());
		return user.toString();
	}
}
