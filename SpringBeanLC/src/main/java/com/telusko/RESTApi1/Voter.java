package com.telusko.RESTApi1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@PropertySource(value="classpath:application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	private String name;
	
	@Value("${voter.info.id}")
	private Integer id;
	
	static{
		System.out.println("Static init block");
	}
	
	{
		System.out.println("Instance init block");
	}
	
	public Voter(){
		System.out.println("Voter instance is created");
	}
	
//	@PostConstruct
//	public void init(){
//	
//		System.out.println("Init method is getting invocked after Constructing object");
//	}
	
	//Business logic
	public String checkEligibility(int age){
		
		System.out.println("Hello "+ name + " Your Id number is "+ id);
		if(age<18)
			return "Have Patience! Your time will come to vote";
		else
			return "You're Eligible to Vote, Kindly Vote wisely";
	}
	
	@PreDestroy
	public void destroy(){
		
		System.out.println("Destroyed");
	}
}
