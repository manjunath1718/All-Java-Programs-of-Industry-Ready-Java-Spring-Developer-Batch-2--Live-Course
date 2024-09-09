package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.TouristRepo;
import com.telusko.exception.TouristNotFoundException;
import com.telusko.model.Tourist;
@Service
public class TouristServiceImpl implements ITouristService {

	@Autowired
	TouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		
		Tourist touristdb = repo.save(tourist);
		return "Tourist Info is registered successfully with id "+ touristdb.getId();
	}
	
//	@Override
//	public Tourist fetchTouristById(String id) {
//
//		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist with id "+id+" Not Found"));
//	}
	
	@Override
	public Tourist fetchTouristById(String id) {

		return repo.findById(id).get();
	}

	@Override
	public List<Tourist> fetchAllTourists() {
		
		return repo.findAll();
	}

	@Override
	public String deleteTouristById(String id) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Tourist Info with Id "+id+" deleted";
		}else {
			throw new TouristNotFoundException("Tourist with id "+id+" Not Found");
		}
		
	}

	@Override
	public String updateTouristPackageType(String id, String packageType) {
		
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setPackageType(packageType);
			repo.save(tourist);
			return "Tourist Info with Id "+id+" updated";
		}else {
			throw new TouristNotFoundException("Tourist with id "+id+" Not Found");
		}
		
	}

	@Override
	public String updateTourist(Tourist tourist) {
		Optional<Tourist> optional = repo.findById(tourist.getId());
		if(optional.isPresent()) {
			Tourist savedData = repo.save(tourist);
			return "Tourist info with id "+savedData.getId()+ " updated";
		}else {
			throw new TouristNotFoundException("Tourist with id "+ tourist.getId()+ " is not present in records to update");
		}
		
	}

	

}
