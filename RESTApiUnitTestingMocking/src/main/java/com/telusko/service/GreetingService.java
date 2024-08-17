package com.telusko.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String generateGreeting() {

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

		return response;

	}

}
