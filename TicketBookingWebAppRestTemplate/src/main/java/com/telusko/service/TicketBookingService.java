package com.telusko.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telusko.model.Passenger;
import com.telusko.model.Ticket;

@Service
public class TicketBookingService implements ITicketBookingService {

	private String BOOK_TICKET_URL=
			"http://localhost:8585/TicketBookingAPI/api/book-ticket/getTicketNumber";

	private String TICKET_INFO_URL=
			"http://localhost:8585/TicketBookingAPI/api/book-ticket/getTicket/{ticketNumber}";

	
	@Override
	public Ticket registerPassenger(Passenger passenger) {
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Ticket> response =
				restTemplate.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		return response.getBody();
	}

	@Override
	public Ticket getFullTicketInfo(Integer ticketNumber) {
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Ticket> response = 
				restTemplate.getForEntity(TICKET_INFO_URL, Ticket.class, ticketNumber);
		
		return response.getBody();
	}

}