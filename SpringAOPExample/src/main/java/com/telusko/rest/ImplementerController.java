package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Implementers;
import com.telusko.service.IImplementerService;

@RestController
public class ImplementerController {

	@Autowired
	IImplementerService service;
	
	@PostMapping("/reg")
	public ResponseEntity<Implementers> registerImplementer(@RequestBody Implementers impl){
		
		Implementers implementer = service.registerImplementer(impl);
		return new ResponseEntity<Implementers>(implementer,HttpStatus.CREATED);
	}
	
	@GetMapping("/allImplementers")
	public ResponseEntity<List<Implementers>> fetchAllImplementers(){
		
		 List<Implementers> list = service.fetchAllImplementers();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/implementer/{id}")
	public ResponseEntity<Implementers> fetchImplementersById(@PathVariable Integer id){
		
		 Implementers impl = service.findImplementerById(id);
		return new ResponseEntity<>(impl,HttpStatus.OK);
	}
	
}
