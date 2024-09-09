package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.telusko.repo.cx", "com.telusko.repo.pd"})
public class SpringMultiDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiDbApplication.class, args);
	}

}
