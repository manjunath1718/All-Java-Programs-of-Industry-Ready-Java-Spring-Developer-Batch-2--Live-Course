package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.telusko.dao.ITicketRepo;
import com.telusko.model.Passenger;

@Service
//@Scope("prototype")
public class TicketService implements ITicketService {

	@Autowired
	ITicketRepo repo;
	
	public TicketService(){
		System.out.println("TicketService Bean created");
	}
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassengerById(Integer id) {
		
		System.out.println("hashcode of repo internal bean "+repo.hashCode());
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}
