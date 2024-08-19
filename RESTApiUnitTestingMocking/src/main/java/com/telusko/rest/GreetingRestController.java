package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Tourist;
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

	@PostMapping("/addTourist")
	public ResponseEntity<String> addTourist(Tourist tourist){

		Boolean status = service.acceptTourist(tourist);
		String msg = null;
		if(status) {

			msg="Tourist data added and request is considered";

			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {

			msg="Tourist data couldn't be  added and request is not considered";

			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
	}
}
