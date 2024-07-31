package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Password;
import com.telusko.service.Service;

import in.telusko.ALien;

public class LaunchMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Password pass=context.getBean(Password.class);
		//Password pass = (Password) context.getBean("pass");
		pass.passwordGenerated();
		
//		Service service=(Service) context.getBean("ser");
//		Service service = context.getBean("ser", Service.class);
//		service.logic();
		
		Alpha alpha= (Alpha) context.getBean("alpha");
		alpha.greet();
	}

}
