package com.telusko.SpringDataJpaProject01.service;

import com.telusko.SpringDataJpaProject01.entity.CustomerInfo;

public interface ICustomerService {

	public String registerCustomerInfo(CustomerInfo cx);
	public Iterable<CustomerInfo> fetchAllCx();
}
