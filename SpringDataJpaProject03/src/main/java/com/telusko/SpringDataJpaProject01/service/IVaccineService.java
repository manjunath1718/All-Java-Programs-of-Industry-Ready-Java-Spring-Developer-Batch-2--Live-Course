package com.telusko.SpringDataJpaProject01.service;


import java.util.ArrayList;
import java.util.List;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineService {

	public Iterable<Vaccine> fetchDetails(Boolean status,String...properties);

	public List<Vaccine> fetchDetails(int pgNo,int pgSize,Boolean status,String...properties);
   
	public void fetchAllPageDetails(int pageSize);
	
	public ArrayList<Object> getAllPageDetails(int pageSize);

}
