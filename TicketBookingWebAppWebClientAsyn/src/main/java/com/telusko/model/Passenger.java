package com.telusko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

	private Integer pid;

	private String name;

	private String departure;

	private String arrival;

	private String dateOfJourney;

}
