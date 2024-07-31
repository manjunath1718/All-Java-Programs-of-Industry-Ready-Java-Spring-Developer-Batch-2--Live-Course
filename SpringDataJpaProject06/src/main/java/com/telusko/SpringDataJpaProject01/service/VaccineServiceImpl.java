package com.telusko.SpringDataJpaProject01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.repo.IVaccineRepo;
import com.telusko.SpringDataJpaProject01.view.ResultView;

@Service
public class VaccineServiceImpl implements IVaccineService{

	@Autowired
	IVaccineRepo repo;

	@Override
	public List<ResultView> fetchByVaccineCostLessThan(Double vaccineCost) {
		
		return repo.findByVaccineCostLessThan(vaccineCost);
	}

	

	
	

	
	

}
