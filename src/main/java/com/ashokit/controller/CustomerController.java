package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashokit.domain.Customer;

@Controller
public class CustomerController {

	@GetMapping("/customer")
	public @ResponseBody Customer getCustomer() {

		Customer c = new Customer();
		c.setCustomerId(101);
		c.setCustomerName("Mahesh");
		c.setCustomerEmail("mahi.g@gmail.com");

		return c;
	}
}
