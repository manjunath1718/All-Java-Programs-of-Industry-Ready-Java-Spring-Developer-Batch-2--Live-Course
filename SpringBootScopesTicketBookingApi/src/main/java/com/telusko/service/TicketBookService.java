package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.ITicketRepo;

@Service
public class TicketBookService {
	
	@Autowired
	ITicketRepo repo;
	
	public TicketBookService(){
		
		System.out.println("TicketBookService Bean created");
	}
	
	public void ticketService() {
		System.out.println("hashcode of repo internal bean "+repo.hashCode());
		
	}

}
