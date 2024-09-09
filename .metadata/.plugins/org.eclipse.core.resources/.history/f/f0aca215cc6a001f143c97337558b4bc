package com.telusko.SpringMultiDb.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringMultiDb.model.customer.Customer;
import com.telusko.SpringMultiDb.model.product.Product;
import com.telusko.SpringMultiDb.repo.cx.ICustomerRepo;
import com.telusko.SpringMultiDb.repo.pd.IProductRepo;

@RestController
@RequestMapping("/api")
public class MultiDbController 
{
	
	private IProductRepo repo1;
	
	private ICustomerRepo repo2;
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts()
	{
		return repo1.findAll();
	}
	
	@GetMapping("/getallcx")
	public List<Customer> getAllCustomers()
	{
		return repo2.findAll();
	}

}
