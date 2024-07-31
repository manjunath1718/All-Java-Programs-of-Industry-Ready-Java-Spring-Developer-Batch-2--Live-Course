package com.telusko.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{

	
	public Config()
	{
		System.out.println("Config bean is created");
	}
	
	@Bean
	public Password createPasswordInstance()
	{
		Password pass=new Password("SHA");
		return pass;
	}
//	@Bean
//	public ArrayList create()
//	{
//		return new ArrayList();
//	}
}
