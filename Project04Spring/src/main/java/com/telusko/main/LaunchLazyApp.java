package com.telusko.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.telusko.beans.Employee;

public class LaunchLazyApp {

	public static void main(String[] args) {
		
//		Resource resource=new ClassPathResource("applicationconfiguration.xml");		
//		BeanFactory container=new XmlBeanFactory(resource);
//		
//		Employee emp1 = container.getBean("emp1",Employee.class);
//		System.out.println(emp1);
		
		DefaultListableBeanFactory container=new DefaultListableBeanFactory();

		XmlBeanDefinitionReader read=new XmlBeanDefinitionReader(container);
		
		read.loadBeanDefinitions("applicationconfiguration.xml");
		read.loadBeanDefinitions("applicationconfiguration2.xml");
		
		Employee emp = container.getBean("emp3",Employee.class);
		System.out.println(emp);
		
		System.out.println("************************************");
		Employee emp2 = container.getBean("emp2", Employee.class);
		System.out.println(emp2);

	}

}
