package com.telusko.Service;

public class FedEX implements Services {

	@Override
	public boolean deliverProduct(double amount) {
		System.out.println("Product Delivered with FedEX & amount paid is "+amount);
		return true;	
	}

}
