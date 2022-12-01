package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteAPIController {

	@DeleteMapping("/delete/{userId}")
	public int delete1(@PathVariable long userId, @RequestParam String account) {
		System.out.println("userId: " + userId);
		System.out.println("account: " + account);
		return 1;
	}

	@DeleteMapping("/d/{userId}")
	public String delete2(@PathVariable long userId) {

		String result = "fail";
		if (userId < 100) {
			result = "ok";
		}
		String myJson = "{\r\n" + "	\"result\" : \"" + result + "\"\r\n" + "}";
		return myJson;
	}
}
