package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.exception.TouristNotFoundException;
import com.telusko.model.Tourist;
import com.telusko.service.ITouristService;
import com.telusko.util.IdGenerator;

@RestController
@RequestMapping("/api")
public class TouristController {

	@Autowired
	ITouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<?> registertourist(@RequestBody Tourist tourist){
		
		tourist.setId(IdGenerator.generateId());
		try
		{
			String status =service.registerTourist(tourist);
			return new ResponseEntity<String>(status, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>("Some problem in registration", HttpStatus.INTERNAL_SERVER_ERROR);
 
		}
	}
	
	@GetMapping("/tourist/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id") String id){
		
		try {
			Tourist tourist = service.fetchTouristById(id);
			 return new ResponseEntity<>(tourist, HttpStatus.OK);
		}catch(TouristNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		  
	}
	
	@GetMapping("/alltourists")
	public ResponseEntity<?> getAllTourists(){
		
		 List<Tourist> list = service.fetchAllTourists();
		 return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PatchMapping("/updatePackageType/{id}/{package}")
	public ResponseEntity<?> updateTouristPackageType(@PathVariable String id,
			@PathVariable("package") String packageType){
		try {
			
			String updateMsg = service.updateTouristPackageType(id, packageType);
	
			return new ResponseEntity<>(updateMsg,HttpStatus.OK); 
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PutMapping("/updateInfo")
	public ResponseEntity<?> updateTouristInfo(@RequestBody Tourist tourist){
		
		try {
			String updatemsg = service.updateTourist(tourist);
			return new ResponseEntity<>(updatemsg,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTouristById(@PathVariable String id) {
		
		try {			
			String delMsg = service.deleteTouristById(id);
		    return new ResponseEntity<>(delMsg, HttpStatus.OK); 
		}catch(Exception e){
			
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}

		
	}
}