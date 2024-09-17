package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Users;

public interface UsersRepo extends JpaRepository<Users, String> {

	public Users findByUserName(String userName);
}