package com.telusko.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

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
		
//		RestTemplate restTemplate=new RestTemplate();
//		ResponseEntity<Ticket> response =
//				restTemplate.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
//		return response.getBody();
		WebClient webClient = WebClient.create();
		Ticket response = webClient.post()
		.uri(BOOK_TICKET_URL)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return response;
	}

	@Override
	public Ticket getFullTicketInfo(Integer ticketNumber) {
//		RestTemplate restTemplate=new RestTemplate();
//		ResponseEntity<Ticket> response = 
//				restTemplate.getForEntity(TICKET_INFO_URL, Ticket.class, ticketNumber);		
//		return response.getBody();
		
		WebClient webClient = WebClient.create();
		Ticket response = webClient.get()
		.uri(TICKET_INFO_URL, ticketNumber)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return response;
	}

}