package com.telusko.SpringDataJpaProject01.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.SpringDataJpaProject01.entity.CustomerInfo;

public interface ICustomerRepo extends CrudRepository<CustomerInfo, Integer>{

	
}
