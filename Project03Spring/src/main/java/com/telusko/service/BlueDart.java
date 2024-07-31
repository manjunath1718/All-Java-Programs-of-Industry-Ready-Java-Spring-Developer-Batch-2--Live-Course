package com.telusko.service;

import org.springframework.stereotype.Component;

@Component
public class BlueDart implements DeliveryService {

	public BlueDart()
	{
		System.out.println("BlueDart bean is created");
	}
	
	@Override
	public boolean deliverProduct(Double amount) {
		System.out.println("product Delivered through BlueDart and amount paid is "+amount);
		return true;
	}

}
