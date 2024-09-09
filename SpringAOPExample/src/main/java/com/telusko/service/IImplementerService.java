package com.telusko.service;

import java.util.List;

import com.telusko.model.Implementers;

public interface IImplementerService {

	public Implementers registerImplementer(Implementers impl);
	public List<Implementers>fetchAllImplementers();
	public Implementers findImplementerById(Integer id);
	
}
