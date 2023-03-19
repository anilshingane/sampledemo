package com.Gettingstarted.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	public String getMessage() {
		
		return "Welcome to springboot application in openshift container!!";
	}
}
