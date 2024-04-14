package com.rishu.user3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user1")
public class UserController {
	
	
	@GetMapping("/")
	public String getData()
	{
		return "Hello Rishu";
	}

}
