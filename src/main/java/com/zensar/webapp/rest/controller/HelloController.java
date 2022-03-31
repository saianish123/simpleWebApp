package com.zensar.webapp.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
	@GetMapping("/Hello")
	public String getmessage() {
		return "Welcome to .......................";
	}
}