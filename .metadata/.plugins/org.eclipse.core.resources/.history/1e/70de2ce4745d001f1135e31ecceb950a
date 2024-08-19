package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.IGreetingService;

@RestController
public class GreetingRestController {

	@Autowired
	IGreetingService service;

	@GetMapping("/greet")
	public ResponseEntity<String> getGreetings(){
		
		String response = service.generateGreeting();
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
