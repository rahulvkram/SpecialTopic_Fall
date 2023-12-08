package com.example1;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements Engine{
	@Override
	public Integer start() {
		System.out.println("PE");	
		return 0;
	}
}
