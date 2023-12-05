package com.example.CI;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Constructor : Engine");	
	}
	
	public Integer start() {
		return 0;
	}
}
