package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienRestController {

	@PostMapping("/addalien")
	public ResponseEntity<String> getAlienInfo(@RequestBody Alien alien){
		
		System.out.println(alien);
		String addMsg="Alien Data Added successfully";
		return new ResponseEntity<String>(addMsg,HttpStatus.OK);
	}
	

}
