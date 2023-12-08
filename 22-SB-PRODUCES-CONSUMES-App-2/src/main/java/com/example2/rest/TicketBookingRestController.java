package com.example2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.request.bindings.PassengerInfo;
import com.example2.response.bindings.TicketInfo;

@RestController
public class TicketBookingRestController {
	@PostMapping(value="/ticketbooking")
//			consumes= {MediaType.APPLICATION_JSON_VALUE},
//			produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<TicketInfo> ticketbooking(@RequestBody PassengerInfo passenger) { 
		
		System.out.println(passenger);
		TicketInfo ticket = new TicketInfo();
		ticket.setTicketNumber(12345);
		ticket.setTicketPrice(200);
		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setTicketStatus("CONFIRMED");
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}
}