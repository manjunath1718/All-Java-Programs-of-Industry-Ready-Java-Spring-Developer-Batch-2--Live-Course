package com.telusko.SpringDataJpaProject01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.repo.IVaccineRepo;
import com.telusko.SpringDataJpaProject01.view.View;

@Service
public class VaccineServiceImpl implements IVaccineService{

	@Autowired
	IVaccineRepo repo;

	@Override
	public < T extends View>List<T> fetchByVaccineCostLessThan(Double vaccineCost, Class<T> cls) {
		
		return repo.findByVaccineCostLessThan(vaccineCost, cls);
	}

	

	

	
	

	
	

}
