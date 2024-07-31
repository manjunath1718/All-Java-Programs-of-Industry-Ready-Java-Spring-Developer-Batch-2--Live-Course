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
	public List<Vaccine> searchByGivenVaccineInfo(Vaccine v,Boolean status,String...params) {
		
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, params);
		Example<Vaccine> example=Example.of(v);
		
		return repo.findAll(example, sort);
	}
	
	@Override
	public Vaccine searchByVaccineId(Integer id) {
		
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> searchByVaccineIds(Iterable<Integer> ids) {
					
		return repo.findAllById(ids);
	}

	@Override
	public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine) {
		
//		Example<Vaccine> example = Example.of(vaccine);
//		List<Vaccine> vaccines = repo.findAll(example);
//		return vaccines;
		
		return repo.findAll(Example.of(vaccine));
	}

	@Override
	public String removeVaccineByIds(Iterable<Integer> ids) {
		List<Vaccine> vaccines = repo.findAllById(ids);
		if(vaccines.size()!=0) {
			repo.deleteAllByIdInBatch(ids);//no of database hits are less, only 1 query generated
			return "Records Deleted for the Given Ids";
		}
		return "Fail to Delete the Records";
	}

	@Override
	public String removeVaccineByIdsCRUD(List<Integer> ids) {
		
		List<Vaccine> vaccines = repo.findAllById(ids);
		
		if(vaccines.size()==ids.size()) {
			repo.deleteAllById(ids);//no of database hits are more, multiple queries generated
			return "Records Deleted for the Given Ids";
		}
		return "Fail to Delete the Records";
	}

	

	
	

}
