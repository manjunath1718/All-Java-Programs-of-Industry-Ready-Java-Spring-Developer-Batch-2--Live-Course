package com.telusko.rest;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api1")
public class GreetingRestController {

	@GetMapping("/greet")
	@ResponseBody
	public ResponseEntity<String> getGreetings(){
		
		int hour = LocalTime.now().getHour();
		String response =null;
		if(hour<12) {
			response="Good Morning" ;
		}else if(hour<16) {
			response="Good Afternoon" ;
		}else if(hour<20) {
			response="Good Evening" ;
		}else {
			response="Good Night" ;
		}
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}