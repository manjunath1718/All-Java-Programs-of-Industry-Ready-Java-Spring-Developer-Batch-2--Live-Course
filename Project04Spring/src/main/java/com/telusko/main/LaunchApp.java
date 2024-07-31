package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationConfiguration.xml");

//		Employee emp1 = container.getBean(Employee.class);
//		String str=emp1.taskEmployee();
//		System.out.println(str);
//		System.out.println(emp1);
		
//		Employee emp2 = container.getBean("emp2",Employee.class);
//		String str2=emp2.taskEmployee();
//		System.out.println(str2);
//		System.out.println(emp2);
		
		Employee emp3 = container.getBean("emp3",Employee.class);
		System.out.println(emp3);
	}

}
