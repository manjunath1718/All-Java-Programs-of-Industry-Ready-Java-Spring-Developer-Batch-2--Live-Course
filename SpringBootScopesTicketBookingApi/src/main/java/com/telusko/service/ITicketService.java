package com.telusko.service;

import com.telusko.model.Passenger;

public interface ITicketService {

	public Passenger registerPassenger(Passenger passenger);
	public Passenger fetchPassengerById(Integer id);
}
