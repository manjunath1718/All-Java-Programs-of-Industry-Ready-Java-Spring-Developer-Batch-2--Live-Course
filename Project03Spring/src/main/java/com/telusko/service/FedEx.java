package com.telusko.service;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements DeliveryService {
	
	public FedEx()
	{
		System.out.println("FedEx bean is created");
	}

	@Override
	public boolean deliverProduct(Double amount) {
		System.out.println("product Delivered through FedEx and amount paid is "+amount);
		return true;
	}

}
