package com.example1;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Engine {
	@Override
	public Integer start() {
		System.out.println("DE");	
		return 0;
	}
}
