package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.model.Users;
import com.telusko.repo.UsersRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UsersRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = repo.findByUserName(username);
		
		if(user==null) {
			
			System.out.println("User Not found");
			throw new UsernameNotFoundException("User Not Found 404");
		}
		return new UserPrincipal(user);
	}

	
}