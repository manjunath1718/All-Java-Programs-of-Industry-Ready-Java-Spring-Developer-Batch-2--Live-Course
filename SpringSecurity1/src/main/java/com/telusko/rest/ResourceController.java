package com.telusko.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ResourceController {

	@GetMapping("/info")
	public String getInfo(HttpServletRequest request){
		
		return "this is spring security learning program "+request.getSession().getId();
	}
	
	@GetMapping("/moreinfo")
	public String getMoreInfo(HttpServletRequest request){
		
		return "spring security is about who can access what resources "+request.getSession().getId();
	}
	
	
	
}
