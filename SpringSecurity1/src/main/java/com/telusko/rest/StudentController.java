package com.telusko.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students=new ArrayList<>(List.of(new Student(1, "Rohan", "Java"),
			new Student(2, "Harsh", "SpringBoot") ));
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		
		return students;
	}
	
	@PostMapping("/addstudent")
	public Boolean addStudent(@RequestBody Student student){
		
		return students.add(student);
	}
	
	@GetMapping("/csrftoken")
	public CsrfToken getCsrfToken(HttpServletRequest request){
				
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
	
}