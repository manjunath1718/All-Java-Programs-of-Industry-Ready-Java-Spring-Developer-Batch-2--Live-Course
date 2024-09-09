package com.telusko.config;

import org.springframework.batch.item.ItemProcessor;

import com.telusko.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		
		if(item.getCountry().equalsIgnoreCase("United States of America")) {
			item.setCountry("USA");
		}
		
		return item;
	}

}
