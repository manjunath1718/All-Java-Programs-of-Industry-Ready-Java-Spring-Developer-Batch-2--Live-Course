package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.model.Customer;
import com.telusko.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/cxlist")
	public String getCustomerInfo(Model model) {
		
		model.addAttribute("customers", service.getAllCx());
		
		return "customerlist";
	}
	
	@PostMapping("/registerCustomer")
	public String registerCustomer(@ModelAttribute("customer")Customer customer) {
		
		service.registerCustomer(customer);
		return "redirect:/cxlist";
	}

	@GetMapping("/showform")
	public void  getForm(@ModelAttribute Customer customer){
		
	}
	
	@GetMapping("/updateform")
	public String updateCustomer(@ModelAttribute Customer customer) {

		return "showform";		
	}
	
	@GetMapping("/deleteData")
    public String deleteCustomer(@RequestParam Integer id){
		
		service.deleteCustomerById(id);
		return "redirect:/cxlist";
	}
	
}