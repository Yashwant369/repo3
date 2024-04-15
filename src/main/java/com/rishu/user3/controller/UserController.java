package com.rishu.user3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@GetMapping("/user3")
	public String getData()
	{
		return "Hello Rishu";
	}
	@GetMapping("/")
	public String getData1()
	{
		return "Healthy";
	}

}
