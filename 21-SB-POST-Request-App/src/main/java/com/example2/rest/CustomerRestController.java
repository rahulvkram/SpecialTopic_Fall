package com.example2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.bindings.Customer;

@RestController

public class CustomerRestController {
	@PostMapping(value="/customer",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		String txt="Customer data is saved";
		return new ResponseEntity<String>(txt,HttpStatus.CREATED);	
	}
}
