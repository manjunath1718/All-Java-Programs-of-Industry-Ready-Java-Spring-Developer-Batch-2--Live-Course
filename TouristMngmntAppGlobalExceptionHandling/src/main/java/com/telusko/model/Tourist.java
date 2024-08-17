package com.telusko.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Tourist")
@Data
@NoArgsConstructor
public class Tourist {

	@Id
	private String id;

	private String name;

	private String city;

	private String packageType;

	private Double budget;

	public Tourist(String name, String city, String packageType, Double budget) {
		super();
		this.name = name;
		this.city = city;
		this.packageType = packageType;
		this.budget = budget;
	}
	
	

}