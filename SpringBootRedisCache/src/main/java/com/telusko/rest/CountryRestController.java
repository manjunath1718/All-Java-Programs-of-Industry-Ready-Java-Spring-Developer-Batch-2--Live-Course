package com.telusko.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Country;
import com.telusko.service.CountryService;

@RestController
public class CountryRestController {

	@Autowired
	private CountryService service;

	@PostMapping("/addcountry")
	public String addCountry(@RequestBody Country country){

		return service.addCountry(country);
	}

	@GetMapping("/getcountries")
	public Map<Object, Object> fetchAllCountries(){

		return service.getAllCountries();
	}


}