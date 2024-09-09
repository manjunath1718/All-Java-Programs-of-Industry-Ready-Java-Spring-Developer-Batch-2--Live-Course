package com.telusko.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.telusko.model.Country;

@Service
public class CountryService {

	
	private HashOperations<String, Object, Object> opsForHash=null;

//	@Autowired
//	private RedisTemplate<String, Country> redis;

	public CountryService(RedisTemplate<String, Country> redis){

		this.opsForHash=redis.opsForHash();
	}
	
	public String addCountry(Country country){
		
		opsForHash.put("COUNTRIES", country.getNo(), country.getName());
		
		return "Country Info Added to redis Cache ";		
	}
	
//	public Collection<Object> getAllCountries(){
//		
//		Map<Object, Object> entries = opsForHash.entries("COUNTRIES");
//		return entries.values();
//	}
	
	public Map<Object, Object> getAllCountries(){
		
		Map<Object, Object> entries = opsForHash.entries("COUNTRIES");
		return entries;
	}
	
}