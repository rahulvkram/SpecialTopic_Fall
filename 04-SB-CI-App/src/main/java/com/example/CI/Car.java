package com.example.CI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine eng;
	
	@Autowired
	/*Here, since we represented Car class with @Component, IoC treats it as bean and creates object for it.
	  Then the constructor gets called. Since we defined param constructor,there will be no default constructor.
	  So, IoC has to call this param constructor.But,to call this param constructor,it has to supply eng
	  object as parameter which means DI is completed. So there is no specific use of @Autowired. So, it's
	  optional*/
	public Car(Engine eng) {
		System.out.println("Constructor : Car");
		this.eng=eng;
	}
	public void drive() {
		System.out.println(eng.start());
		Integer status = eng.start();
		//System.out.println(status);
		if(status == 0) {
			System.out.println("Journey has started");
		}
	}
}
	

