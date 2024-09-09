package com.telusko.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Passenger;
import com.telusko.model.Ticket;
import com.telusko.service.ITicketService;
import com.telusko.service.TicketBookService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/book-ticket")
@Tag(name="TicketBookingAPIS", description="APIS to book ticket by passing passenegr info ")
//@Scope("prototype")//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("request")
@Scope("session")
public class TicketController {
	
	@Autowired
	ITicketService service;
	
	@Autowired
	TicketBookService service2;
	
	public TicketController(){
		System.out.println("TicketController Bean created");
	}

	@PostMapping("/getTicketNumber")
	@Operation(summary="POST operation", description="API will accept json type of passeneger info and will return ticket number")
	public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger){
		
		Passenger pass = service.registerPassenger(passenger);
		Ticket ticket=new Ticket();
		ticket.setTicketNumber(pass.getPid());
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	
	@GetMapping("/getTicket/{ticketNumber}")
	@Operation(summary="GET operation", description="API will accept ticket number info and will return detailed ticket object")
	public ResponseEntity<Ticket> getFullTicket(@PathVariable("ticketNumber") Integer ticketNumber){
		
		service2.ticketService();
		
		Passenger pass = service.fetchPassengerById(ticketNumber);
		Ticket ticket=new Ticket();
		ticket.setTicketNumber(pass.getPid());
		ticket.setName(pass.getName());
		ticket.setArrival(pass.getArrival());
		ticket.setDeparture(pass.getDeparture());
		ticket.setDateOfJourney(pass.getDateOfJourney());
		ticket.setStatus("confirmed");
		ticket.setTicketCost(5000.0);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	
	
}
