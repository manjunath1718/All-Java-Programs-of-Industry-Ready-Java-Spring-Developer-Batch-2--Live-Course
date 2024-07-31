package com.telusko.SpringDataJpaProject01.service;


import java.util.ArrayList;
import java.util.List;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineService {

	public List<Vaccine> fetchByVaccineName(String vaccineName);		
	public List<Vaccine> fetchByVaccineCompany(String vaccineCompany);
	public List<Vaccine> fetchByVaccineCost(Double vaccineCost);
	
	public List<Vaccine> fetchByVaccineNameIn(String... vaccineName);
	public List<Vaccine> fetchByVaccineCostBetween(Double minVaccCost,Double maxVaccCost);
}
