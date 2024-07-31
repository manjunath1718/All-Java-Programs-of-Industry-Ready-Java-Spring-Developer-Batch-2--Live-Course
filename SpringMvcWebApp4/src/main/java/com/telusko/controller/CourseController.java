package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.model.Course;

@Controller
public class CourseController {

	@GetMapping("course1")
	public String getCourse(Model model) {
		Course course=new Course(1, "DevOps", 4999.9);
		model.addAttribute("course", course);
		
		return "course1";		
	}
	
	@GetMapping("course2")
	public String getCourse(Map<String,Object> map) {
		
		map.put("id", 2);
		map.put("name", "SpringBoot");
		map.put("cost", 10000.0);
		
		return "course2";		
	}
	
	
	
	
}
