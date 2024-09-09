package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Implementers;
import com.telusko.repo.IImplementerRepo;

@Service
public class ImplementerService implements IImplementerService {

	@Autowired
	IImplementerRepo repo;
	
	@Override
	public Implementers registerImplementer(Implementers impl) {
		
		return repo.save(impl);
	}

	@Override
	public List<Implementers> fetchAllImplementers() {
		
		return repo.findAll();
	}

	@Override
	public Implementers findImplementerById(Integer id)  {

			return repo.findById(id).orElseThrow(()->new RuntimeException("Implementer with Id "+id+" Not Found"));

	}
	
	

	
}