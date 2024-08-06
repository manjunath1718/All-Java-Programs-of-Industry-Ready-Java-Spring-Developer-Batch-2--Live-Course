package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Customer;
import com.telusko.repo.CustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
    CustomerRepo repo;
    
	@Override
	public List<Customer> getAllCx() {
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
		
		repo.save(customer);
	}

	@Override
	public void deleteCustomerById(Integer id) {
		
		repo.deleteById(id);
	}

	

}