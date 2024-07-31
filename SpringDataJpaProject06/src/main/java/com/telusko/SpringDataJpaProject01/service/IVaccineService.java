package com.telusko.SpringDataJpaProject01.service;


import java.util.ArrayList;
import java.util.List;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.view.ResultView;

public interface IVaccineService {

	public List<ResultView> fetchByVaccineCostLessThan(Double vaccineCost);
	
}
