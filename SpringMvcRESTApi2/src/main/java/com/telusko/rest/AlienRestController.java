package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienRestController {

	@GetMapping("/getalien")
	public ResponseEntity<Alien> getAlienInfo(){
		
		Alien alien =new Alien(101,"navin","hyderabad");
		return new ResponseEntity<Alien>(alien,HttpStatus.OK);
	}
	
//	@GetMapping("/getalien")
//	public Alien getAlienInfo(){
//		
//		Alien alien =new Alien(101,"navin","hyderabad");
//		return alien;
//	}
}