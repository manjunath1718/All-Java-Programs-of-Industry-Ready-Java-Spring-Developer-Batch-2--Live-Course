package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
