package com.telusko.Service;

public class DHL implements Services{

	@Override
	public boolean deliverProduct(double amount) {
		System.out.println("Product Delivered with DHL & amount paid is "+amount);
		return true;	
	}

}
