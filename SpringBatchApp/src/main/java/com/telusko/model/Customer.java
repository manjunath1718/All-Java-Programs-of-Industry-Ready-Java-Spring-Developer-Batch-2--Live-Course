package com.telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	private Integer customerID;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String address;

	private String city;

	private String state;

	private String zipCode;

	private String country;
	
}
