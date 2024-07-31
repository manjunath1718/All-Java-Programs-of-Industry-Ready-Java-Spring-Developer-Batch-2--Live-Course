package com.telusko.main;

import com.telusko.service.DeliveryService;

public class Amazon {

	private DeliveryService service;

	public Amazon(DeliveryService service) 
	{
		super();
		this.service = service;
	}

	public Amazon() 
	{

		System.out.println("Amazon bean created");
	}

	public void setService(DeliveryService service)
	{
		this.service = service;
	}

	public Boolean initiateDelivery(Double amount)
	{
		return service.deliverProduct(amount);
	}





}
