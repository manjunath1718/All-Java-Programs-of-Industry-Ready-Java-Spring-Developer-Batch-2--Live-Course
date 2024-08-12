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
		
			String status =service.registerTourist(tourist);
			return new ResponseEntity<String>(status, HttpStatus.CREATED);		
	}
	
	@GetMapping("/tourist/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id") String id){
		
		
			Tourist tourist = service.fetchTouristById(id);
			 return new ResponseEntity<>(tourist, HttpStatus.OK);		  
	}
	
	@GetMapping("/alltourists")
	public ResponseEntity<?> getAllTourists(){
		
		 List<Tourist> list = service.fetchAllTourists();
		 return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PatchMapping("/updatePackageType/{id}/{package}")
	public ResponseEntity<?> updateTouristPackageType(@PathVariable String id,
			@PathVariable("package") String packageType){
		
			String updateMsg = service.updateTouristPackageType(id, packageType);
	
			return new ResponseEntity<>(updateMsg,HttpStatus.OK); 		
	}
	
	@PutMapping("/updateInfo")
	public ResponseEntity<?> updateTouristInfo(@RequestBody Tourist tourist){
		
		
			String updatemsg = service.updateTourist(tourist);
			return new ResponseEntity<>(updatemsg,HttpStatus.OK);		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTouristById(@PathVariable String id) {
						
			String delMsg = service.deleteTouristById(id);
		    return new ResponseEntity<>(delMsg, HttpStatus.OK); 		
	}
	
}
