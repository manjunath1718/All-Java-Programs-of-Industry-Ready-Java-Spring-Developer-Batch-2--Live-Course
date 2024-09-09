package com.telusko.SpringMultiDb.repo.cx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringMultiDb.model.customer.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> 
{

}
