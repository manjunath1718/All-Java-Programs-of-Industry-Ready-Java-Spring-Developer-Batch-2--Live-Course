package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.telusko.service.Course;
import com.telusko.service.Mockito;

@SpringBootApplication
public class SpringMvcRestApi1Application implements CommandLineRunner {

	@Autowired
	Course course;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestApi1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Boolean status = course.buyCourse(8000.0);
		if(status) {
			System.out.println("Enrolled successfully");
		}else {
			System.out.println("Failed to Enrolled");
		}
		
	}
	
	@Bean
	@Profile("mock")
	public Mockito createMockitoBean() {
		
		return new Mockito();
	}

}
