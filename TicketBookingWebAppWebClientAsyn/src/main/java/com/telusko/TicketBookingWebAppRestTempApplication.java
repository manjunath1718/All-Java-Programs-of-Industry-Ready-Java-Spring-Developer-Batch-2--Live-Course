package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.telusko.model.Ticket;

@SpringBootApplication
public class TicketBookingWebAppRestTempApplication {

	private static String TICKET_INFO_URL=
			"http://localhost:8585/TicketBookingAPI/api/book-ticket/getTicket/{ticketNumber}";

	public static void main(String[] args) {
		
		SpringApplication.run(TicketBookingWebAppRestTempApplication.class, args);

		System.out.println("Request to API started");
			
			WebClient webClient = WebClient.create();
//		    Ticket ticket = 
		    		webClient.get()
			.uri(TICKET_INFO_URL, 111)
			.retrieve()
			.bodyToMono(Ticket.class)
			.subscribe(TicketBookingWebAppRestTempApplication::handleRespone);
//			.block();
//		    System.out.println(ticket);
		    System.out.println("Request to api ended");
	
	}
	
	public static void handleRespone(Ticket ticket){
		
		System.out.println(ticket);
	}

}
