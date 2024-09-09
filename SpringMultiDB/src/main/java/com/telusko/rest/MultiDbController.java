package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.customer.Customer;
import com.telusko.model.product.Product;
import com.telusko.repo.cx.ICustomerRepo;
import com.telusko.repo.pd.IProductRepo;

@RestController
@RequestMapping("/api")
public class MultiDbController {

	@Autowired
	IProductRepo repo1;
	
	@Autowired
	ICustomerRepo repo2;
	
	@GetMapping("allproducts")
	public List<Product> getAllProducts(){
		
		return repo1.findAll();
	}
	
	@GetMapping("allcustomers")
	public List<Customer> getAllCustomers(){
		
		return repo2.findAll();
	}
	
	
}