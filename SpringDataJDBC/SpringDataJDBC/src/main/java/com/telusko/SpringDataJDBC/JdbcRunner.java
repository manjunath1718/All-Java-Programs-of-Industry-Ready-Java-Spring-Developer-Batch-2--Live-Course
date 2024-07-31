package com.telusko.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.SpringDataJDBC.dao.Implementers;
import com.telusko.SpringDataJDBC.dao.SpringDataJDBC;

@Component
public class JdbcRunner implements CommandLineRunner{

	@Autowired
	SpringDataJDBC dao;
	
	@Override
	public void run(String... args) throws Exception {
		
		dao.insert(new Implementers(17,"Alien","Bengaluru"));
		dao.insert(new Implementers(18,"virat","Bengaluru"));
		dao.delete(17);
	}

}
