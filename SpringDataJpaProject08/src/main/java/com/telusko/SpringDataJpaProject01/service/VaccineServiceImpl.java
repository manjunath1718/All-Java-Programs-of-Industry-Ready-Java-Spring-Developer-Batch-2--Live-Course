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

@Service
public class VaccineServiceImpl implements IVaccineService{

	@Autowired
	IVaccineRepo repo;

	@Override
	public List<Vaccine> searchByVaccineCompany(String company) {
		
		return repo.searchByVaccineCompany(company);
	}

	@Override
	public List<Vaccine> searchByVaccineCompanies(String... companies) {
		
		return repo.searchByVaccineCompanies(companies);
	}

	@Override
	public List<Vaccine> searchByTwoVaccineCompany(String company1, String company2) {
		
		return repo.searchByTwoVaccineCompany(company1, company2);
	}

//	@Override
//	public List<String> searchByVaccinecostBetween(Double minCost, Double maxCost) {
//		
//		return repo.searchByVaccinecostBetween(minCost, maxCost);
//	}	
//	@Override
//	public List<Object[]> searchByVaccinecostBetween(Double minCost, Double maxCost) {
//		
//		return repo.searchByVaccinecostBetween(minCost, maxCost);
//	}
	@Override
	public List<List<String>> searchByVaccinecostBetween(Double minCost, Double maxCost) {
		
		return repo.searchByVaccinecostBetween(minCost, maxCost);
	}
	

	@Override
	public int updateVaccinePriceByVaccineName(String vaccName, Double newPrice) {
		
		return repo.updateVaccinePriceByVaccineName(vaccName, newPrice);
	}

	@Override
	public int deleteVaccineByVaccineCostRange(Double minCost, Double maxCost) {
		
		return repo.deleteVaccineByVaccineCostRange(minCost, maxCost);
	}

	@Override
	public int insertVaccineDetailsBySql( Double vaccineCost, String vaccineCompany, String vaccineName,Integer id) {
		
		return repo.insertVaccineDetailsBySql(vaccineCost, vaccineCompany, vaccineName, id);
	}

	

	

	
	

	
	

}
