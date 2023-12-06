package com.example1;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("Constructor : Diesel Engine");	
	}

	@Override
	public Integer start() {
		return 0;
	}
}
