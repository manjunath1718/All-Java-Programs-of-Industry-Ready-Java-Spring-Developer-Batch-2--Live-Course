package com.telusko.SpringDataJpaProject01.service;


import java.util.ArrayList;
import java.util.List;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineService {

	public List<Vaccine> searchByGivenVaccineInfo(Vaccine v,Boolean status,String...params);

	public Vaccine searchByVaccineId(Integer id);
	
	public List<Vaccine> searchByVaccineIds(Iterable<Integer> ids);
	
	public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine);
	
	public String removeVaccineByIds(Iterable<Integer> ids);
	
	public String removeVaccineByIdsCRUD(List<Integer> ids);
	
}
