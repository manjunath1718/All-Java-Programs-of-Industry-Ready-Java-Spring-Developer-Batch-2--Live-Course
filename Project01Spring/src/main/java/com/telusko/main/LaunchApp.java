package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
 ApplicationContext container=new ClassPathXmlApplicationContext("applicationConfiguration.xml");
	     
         Amazon amz=container.getBean(Amazon.class);
        Boolean status= amz.initiateDelivery(444.4);
        if(status)
        	System.out.println("Product delivered successfully");
        else
        	System.out.println("Failed to deliver product");
		
		
		
	}

}
