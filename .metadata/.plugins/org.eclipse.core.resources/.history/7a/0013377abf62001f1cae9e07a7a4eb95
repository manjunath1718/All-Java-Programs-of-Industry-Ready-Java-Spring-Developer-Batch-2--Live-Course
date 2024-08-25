package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.model.Passenger;
import com.telusko.model.Ticket;
import com.telusko.service.ITicketBookingService;

@Controller
public class TicketBookingController {

	@Autowired
	private ITicketBookingService service;
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model){
		
		Ticket ticket = service.registerPassenger(passenger);
		model.addAttribute("ticketNumber", ticket.getTicketNumber());
		return "index";//lvn
	}
	
	@GetMapping("/form")
	public String getForm(Model model){
		
		System.out.println("hi");
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model){
		
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getTicketInfo(@RequestParam("ticketNumber")Integer ticketNumber,Model model){
		
		Ticket ticket=service.getFullTicketInfo(ticketNumber);
		model.addAttribute("ticket", ticket);		
		return "ticket-info";
	}
}
