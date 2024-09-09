package com.telusko.SpringMultiDb.repo.pd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringMultiDb.model.product.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> 
{

}
