package com.telusko.SpringDataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	//findByProperty	
	public List<Vaccine> findByVaccineName(String vaccineName);	
	public List<Vaccine> findByVaccineCompany(String vaccineCompany);
	public List<Vaccine> findByVaccineCost(Double vaccineCost);
	
	//findByPropertyKeyword
	//findByPropertyKeywordProperty
	public List<Vaccine> findByVaccineNameIn(String...vaccineName);
	public List<Vaccine> findByVaccineCostBetween(Double minVaccCost,Double maxVaccCost);
	
}
