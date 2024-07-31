package com.telusko.SpringDataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	//findByProperty		
	//findByPropertyKeyword
	//findByPropertyKeywordProperty
	public List<ResultView> findByVaccineCostLessThan(Double vaccineCost);
}
