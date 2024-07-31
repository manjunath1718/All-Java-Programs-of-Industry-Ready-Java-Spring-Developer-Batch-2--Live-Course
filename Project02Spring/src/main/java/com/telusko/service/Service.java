package com.telusko.service;

import org.springframework.stereotype.Component;

@Component("ser")
public class Service {
	
   public Service() {
	   
	   System.out.println("Service bean created");
   }
   public void logic()
   {
	   System.out.println("Logic of app in this method");
   }
}

