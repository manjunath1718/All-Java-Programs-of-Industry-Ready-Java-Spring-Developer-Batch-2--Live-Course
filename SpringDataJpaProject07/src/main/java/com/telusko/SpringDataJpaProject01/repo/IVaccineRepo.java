package com.telusko.SpringDataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	//findByProperty		
	//findByPropertyKeyword
	//findByPropertyKeywordProperty
	 public < T extends View>List<T> findByVaccineCostLessThan(Double vaccineCost, Class<T> cls);
}
