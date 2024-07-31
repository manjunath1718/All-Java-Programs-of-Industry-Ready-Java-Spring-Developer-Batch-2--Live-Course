package com.telusko.main;

import com.telusko.service.DeliveryService;

public class Amazon {

	private DeliveryService service;

	public Amazon(DeliveryService service) {
		
		this.service = service;
		System.out.println("Constructor Injection");
	}

	public Amazon() {

		System.out.println("Amazon bean created");
	}

	public void setService(DeliveryService service){
		
		this.service = service;
		System.out.println("Setter Injection");
	}

	public Boolean initiateDelivery(Double amount){
		
		return service.deliverProduct(amount);
	}





}
