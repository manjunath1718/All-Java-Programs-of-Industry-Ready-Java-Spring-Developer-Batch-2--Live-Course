package com.telusko.service;

import com.telusko.model.Tourist;

public interface IGreetingService {
	
	public String generateGreeting(); 
	public Boolean acceptTourist(Tourist tourist);

}
