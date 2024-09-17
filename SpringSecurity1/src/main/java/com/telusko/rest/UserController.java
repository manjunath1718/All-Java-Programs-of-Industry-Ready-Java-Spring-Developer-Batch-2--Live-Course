package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Users;
import com.telusko.service.UsersService;

@RestController
public class UserController {

	@Autowired
	UsersService service;
	
	@PostMapping("/adduser")
	public Users registerUser(@RequestBody Users user) {
		
		return service.registerUsers(user);
	}
	
}
