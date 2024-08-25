package com.telusko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

	private Integer ticketNumber;

	private String status;

	private Double ticketCost;

	private String name;

	private String departure;

	private String arrival;

	private String dateOfJourney;



}
