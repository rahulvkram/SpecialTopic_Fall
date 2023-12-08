package com.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Car {
	
//	@Autowired
//	private DieselEngine eng;
	
	@Autowired
	@Qualifier("pe")
	private Engine eng;
	
	public void drive() {
		Integer status = eng.start();
		if(status == 0) {
			System.out.println("Journey has started");
		}
	}
}
	

