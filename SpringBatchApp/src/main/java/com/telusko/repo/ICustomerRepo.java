package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
