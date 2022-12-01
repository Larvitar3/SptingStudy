package com.example.demo2.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.dto.RequestPutDTO;
import com.example.demo2.dto.ResponsePutDTO;

@RestController
@RequestMapping("/api")
public class PutAPIController {

	@PutMapping("/put1")
	public ResponsePutDTO put1(@RequestBody RequestPutDTO reqdto) {

		// 연산과정 ..
		// DB 접근해서 처리
		ResponsePutDTO result = new ResponsePutDTO();
		result.setName(reqdto.getName());
		result.setAge(reqdto.getAge());
		result.setCarList(reqdto.getCarList());
		result.setStatusCode(200);
		
		return result;
	}

	@PutMapping(path ="/put2/{age}")
	public String put2(@RequestBody RequestPutDTO reqDto, @PathVariable int age) {	
		return reqDto.toString()+"....." + age;
	}
}
