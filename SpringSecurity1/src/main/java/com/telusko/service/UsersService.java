package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.telusko.model.Users;
import com.telusko.repo.UsersRepo;

@Service
public class UsersService {

	@Autowired
	UsersRepo repo;
	
	BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(12);
	
	public Users registerUsers(Users user){
		
		System.out.println(user);
		user.setPassword(bcrypt.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return repo.save(user);
	}
}
