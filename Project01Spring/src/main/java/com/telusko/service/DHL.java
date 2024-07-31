package com.telusko.service;

public class DHL implements DeliveryService {
	
	public DHL()
	{
		System.out.println("DHL bean is created");
	}

	@Override
	public boolean deliverProduct(Double amount) {
		System.out.println("product Delivered through DHL and amount paid is "+amount);
		return true;
	}

}
