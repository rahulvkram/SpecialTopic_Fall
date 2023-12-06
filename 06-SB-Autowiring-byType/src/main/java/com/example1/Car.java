package com.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
//	@Autowired
//	private DieselEngine eng;
	
	@Autowired
	private Engine eng;
	public void drive() {
		System.out.println(eng.start());
		Integer status = eng.start();
		//System.out.println(status);
		if(status == 0) {
			System.out.println("Journey has started");
		}
	}
}
	

