package com.telusko.SpringDataJpaProject01.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineService {

	
	public List<Vaccine> searchByVaccineCompany(String company);
	public List<Vaccine> searchByTwoVaccineCompany(String company1,String company2);	
	public List<Vaccine> searchByVaccineCompanies(String... companies);
//	public List<Object[]> searchByVaccinecostBetween(Double minCost,Double maxCost);
//	public List<String> searchByVaccinecostBetween(Double minCost,Double maxCost);
	public List<List<String>> searchByVaccinecostBetween(Double minCost,Double maxCost);
	
	public int updateVaccinePriceByVaccineName(String vaccName,Double newPrice);
	public int deleteVaccineByVaccineCostRange(Double minCost,Double maxCost);
	public int insertVaccineDetailsBySql( Double vaccineCost, String vaccineCompany, String vaccineName,Integer id);
	
}
