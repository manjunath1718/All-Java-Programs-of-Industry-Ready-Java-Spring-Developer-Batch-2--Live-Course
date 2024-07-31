package com.telusko.SpringDataJpaProject01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.repo.IVaccineRepo;

@Service
public class VaccineServiceImpl implements IVaccineService{

	@Autowired
	IVaccineRepo repo;
	
	@Override
	public String registerVaccineInfo(Vaccine vaccine) {
		
		Vaccine v= repo.save(vaccine);
		 return "Vaccine registered with "+v.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
	}

	@Override
	public Long getCount() {
		
		return repo.count();
	}

	@Override
	public Boolean checkAvailability(Integer id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<Vaccine> getAllVaccineInfo() {
		
		return repo.findAll();
	}

	@Override
	public Iterable<Vaccine> getAllVaccineInfo(Iterable<Integer> vaccineIds) {
		
		return repo.findAllById(vaccineIds);
	}

	@Override
	public Vaccine fetchVaccineByid(Integer id) {
		
		Optional<Vaccine> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		 return new Vaccine();
	}

	@Override
	public String deleteVaccineByid(Integer id) {
		
		Optional<Vaccine> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Vaccine with id "+ id+ " is deleted from records";
		}
		
		return "Vaccine with id "+ id + " is not present in data base";
		
	}

}
