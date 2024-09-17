package com.telusko.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.telusko.model.Users;

public class UserPrincipal implements UserDetails {

	
	Users users;
		
	public UserPrincipal(Users users) {
		super();
		this.users = users;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		
		return users.getPassword();
	}

	@Override
	public String getUsername() {
		
		return users.getUserName();
	}

}
