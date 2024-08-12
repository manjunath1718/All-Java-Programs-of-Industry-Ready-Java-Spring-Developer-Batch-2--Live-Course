package com.telusko.service;

import java.util.List;

import com.telusko.model.Tourist;

public interface ITouristService {

	public String registerTourist(Tourist tourist);
	public Tourist fetchTouristById(String id);
	public List<Tourist> fetchAllTourists();
	public String deleteTouristById(String id);
	public String updateTouristPackageType(String id,String packageType);
	public String updateTourist(Tourist tourist);
	
}
