package com.telusko.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetService {

	@Override
	public String getGreetings(String name) {
		
		int hour=LocalTime.now().getHour();
		
		if(hour<12) 
			return "Hi "+name+" Good Morning";
		else if(hour<16) 
			return "Hi "+name+" Good Afternoon";
		else if(hour<20) 
			return "Hi "+name+" Good Evening";
		else
			return "Hi "+name+" Good Night";
		
	}

}