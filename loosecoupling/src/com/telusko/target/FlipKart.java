package com.telusko.target;

import com.telusko.Service.Services;

public class FlipKart {
	
	private Services service;

	public void setService(Services service) {
		this.service = service;
	}
	
	public boolean intiateDelivery(double amount) {
		return service.deliverProduct(amount);
	}

}
