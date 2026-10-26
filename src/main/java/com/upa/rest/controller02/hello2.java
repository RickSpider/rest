package com.upa.rest.controller02;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello2 {
	
	@GetMapping(value = "/hello2", produces = "application/json")
	public ResponseEntity sayHello() {

		return new ResponseEntity("Hello!!!!!!!", HttpStatus.OK);

	}

}
