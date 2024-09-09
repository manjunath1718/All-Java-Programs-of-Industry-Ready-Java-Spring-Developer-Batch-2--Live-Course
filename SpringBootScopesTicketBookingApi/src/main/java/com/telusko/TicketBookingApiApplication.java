package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(title = "Ticket Booking App",
	               description = "This API is to book Ticket",
		           version = "1.0"),
		servers = @Server(url="http://localhost:8585/TicketBookingAPI",
				          description="This is the server where our app is deployed")
		)
public class TicketBookingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApiApplication.class, args);
	}

}