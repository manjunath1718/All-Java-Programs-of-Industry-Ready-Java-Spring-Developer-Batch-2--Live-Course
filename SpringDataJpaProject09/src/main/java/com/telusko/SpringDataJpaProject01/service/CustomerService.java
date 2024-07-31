package com.telusko.SpringDataJpaProject01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.entity.CustomerInfo;
import com.telusko.SpringDataJpaProject01.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	ICustomerRepo repo;
	
	@Override
	public String registerCustomerInfo(CustomerInfo cx) {
		
		 CustomerInfo customerInfo = repo.save(cx);
		 return "Customer Info Stored in DB with ID "+customerInfo.getId();
	}

	@Override
	public Iterable<CustomerInfo> fetchAllCx() {
		
		return repo.findAll();
	}

}
