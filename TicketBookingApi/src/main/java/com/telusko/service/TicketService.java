package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.ITicketRepo;
import com.telusko.model.Passenger;

@Service
public class TicketService implements ITicketService {

	@Autowired
	ITicketRepo repo;
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassengerById(Integer id) {
		
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}