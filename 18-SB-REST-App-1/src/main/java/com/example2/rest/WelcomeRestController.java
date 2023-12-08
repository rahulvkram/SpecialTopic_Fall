package com.example2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msgText = "1st app using REST";
		return msgText;	
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Hello!";
	}
	

}
 