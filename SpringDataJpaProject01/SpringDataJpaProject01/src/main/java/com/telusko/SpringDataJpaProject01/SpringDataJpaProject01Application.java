package com.telusko.SpringDataJpaProject01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject01.dao.IStudentRepo;
import com.telusko.SpringDataJpaProject01.dao.Student;

@SpringBootApplication
public class SpringDataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);

		IStudentRepo dao = container.getBean(IStudentRepo.class);
		System.out.println("Repo Implementing class==>"+dao.getClass().getName());
	
//		Student std=new Student(2, "raghu", "pune");
//		dao.save(std);		
//		System.out.println("Data saved");
		
		System.out.println(dao.findById(2));
		
		
	}

}
