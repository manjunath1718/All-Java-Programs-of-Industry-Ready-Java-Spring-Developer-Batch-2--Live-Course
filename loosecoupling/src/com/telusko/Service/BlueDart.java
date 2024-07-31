package com.telusko.Service;

public class BlueDart implements Services {

	@Override
	public boolean deliverProduct(double amount) {
		System.out.println("Product Delivered with BlueDart & amount paid is "+amount);
		return true;	
	}

	
}
