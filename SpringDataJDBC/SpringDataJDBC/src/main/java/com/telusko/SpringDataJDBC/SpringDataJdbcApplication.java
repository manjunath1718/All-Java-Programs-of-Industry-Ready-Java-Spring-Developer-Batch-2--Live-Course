package com.telusko.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJDBC.dao.Implementers;
import com.telusko.SpringDataJDBC.dao.SpringDataJDBC;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);

//		SpringDataJDBC dao = container.getBean(SpringDataJDBC.class);
//		dao.insert();
	
//		dao.insert(new Implementers(18, "virat", "Bengaluru"));
		
	}

}
