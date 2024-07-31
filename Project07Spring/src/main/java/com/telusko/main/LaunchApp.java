package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.beans.GreetMe;
import com.telusko.beans.JavaConfiguration;

public class LaunchApp {
	
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(JavaConfiguration.class);

		 GreetMe greet = container.getBean(GreetMe.class);
	     String wish=greet.generateGreeting();
	     System.out.println(wish);
		
	}

}
