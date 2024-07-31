package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.repo.Customer;
import com.telusko.repo.CustomerRepo;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	CustomerRepo repo;
	
	@Override
	public String registerCustomerInfo(CustomerDto dto) {
		Customer customer=new  Customer();
		BeanUtils.copyProperties(dto, customer);
		Customer c = repo.save(customer);
		return "Customer Info Stored in db with Id "+c.getCxNo();
	}

	@Override
	public List<Customer> fetchAllCx() {
		
		return repo.findAll();
	}

	@Override
	public String deleteDocument(String id) {
		
		Optional<Customer> optional = repo.findById(id);
		if(optional.isPresent()) {
			
			repo.deleteById(id);
			return "Document with id "+id+"Deleted";
		}
		
		return "There is no Record with Given Id to delete";
	}

}
