package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationConfiguration.xml");


	}

}
