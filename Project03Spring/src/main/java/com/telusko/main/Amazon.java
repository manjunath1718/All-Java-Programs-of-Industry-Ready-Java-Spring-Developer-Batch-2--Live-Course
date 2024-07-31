package com.telusko.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.service.DeliveryService;

@Component
public class Amazon {

	@Autowired
	private DeliveryService service;

	@Autowired
	public Amazon(@Qualifier("fedEx")DeliveryService service) 
	{
		super();
		this.service = service;
		System.out.println("Amazon param bean created");
	}

	public Amazon() 
	{

		System.out.println("Amazon non param bean created");
	}

	@Autowired
	@Qualifier("blueDart")
	public void setService(DeliveryService service)
	{
		this.service = service;
	}

	public Boolean initiateDelivery(Double amount)
	{
		return service.deliverProduct(amount);
	}





}
