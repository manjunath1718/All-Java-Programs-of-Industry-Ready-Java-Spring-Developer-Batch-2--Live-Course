package com.telusko.service;

import java.util.List;

import com.telusko.repo.Customer;

public interface ICustomerService {

	public String registerCustomerInfo(CustomerDto dto);
	public List<Customer> fetchAllCx();
	public String deleteDocument(String id);
	
	
}
