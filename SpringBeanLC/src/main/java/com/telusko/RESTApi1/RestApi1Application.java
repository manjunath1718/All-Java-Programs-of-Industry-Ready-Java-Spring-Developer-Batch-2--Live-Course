package com.telusko.RESTApi1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApi1Application {

	public static void main(String[] args) {
		
		System.out.println("Container Started");
		ConfigurableApplicationContext context = SpringApplication.run(RestApi1Application.class, args);
			
		Voter voter = context.getBean(Voter.class);
		String status=voter.checkEligibility(20);
		System.out.println(status);
		
		context.close();
		System.out.println("Spring IOC Conatiner closed");
	
	
	}

}
