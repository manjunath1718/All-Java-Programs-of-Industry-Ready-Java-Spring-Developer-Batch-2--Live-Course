package com.telusko.SpringDataJpaProject01.service;

import java.util.List;

import com.telusko.SpringDataJpaProject01.view.View;

public interface IVaccineService {

	public < T extends View>List<T> fetchByVaccineCostLessThan(Double vaccineCost,Class<T> cls);
	
}
