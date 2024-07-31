package com.telusko.main;

import org.springframework.stereotype.Component;

@Component
public class Alpha 
{
   
	public Alpha()
	{
		System.out.println("Alpha bean is created");
	}
	public void greet() {
		System.out.println("hi folks");
	}
}
