package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Course;

@RestController
public class CourseController {

	@PostMapping(value ="/add",consumes={"application/xml","application/json"})
	public ResponseEntity<String> addCourse(@RequestBody Course course) {

		System.out.println(course);
		String msg="Course Info is Added with Id "+course.getCid();
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

	@GetMapping(value="/get",produces={"application/xml","application/json"})
	public ResponseEntity<Course> getCourse() {

		Course course = new Course(101, "Spring", 5000.0);		
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}


}
