package com.telusko.repo.cx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.customer.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
