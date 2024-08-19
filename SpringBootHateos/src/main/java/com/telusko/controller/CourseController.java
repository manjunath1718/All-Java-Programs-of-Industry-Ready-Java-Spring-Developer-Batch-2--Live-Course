package com.telusko.controller;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Course;

@RestController
public class CourseController {

	@GetMapping("/dsa/{id}")
	public ResponseEntity<Course> getDsaCourse(@PathVariable Integer id){		
			
		Course course = new Course(101, "DSA", 5000.0);
		
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Course>> getAllCourse(){
					
		Course course1 = new Course(101, "DSA", 5000.0);
		Course course2 = new Course(102, "Java", 3000.0);
		Course course3 = new Course(103, "Microservices", 8000.0);
		List<Course> list=List.of(course1, course2,course3);
		
		return new ResponseEntity<List<Course>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/spring/{id}")
	public ResponseEntity<Course> getSpringCourse(@PathVariable Integer id){		
			
		Course course = new Course(104, "Spring", 5000.0);
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class)
				.getAllCourse()).withRel("/all");
		course.add(link);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
	
	
}
