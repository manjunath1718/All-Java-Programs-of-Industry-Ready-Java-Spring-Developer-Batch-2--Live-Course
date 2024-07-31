package com.telusko.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.IGreetService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DemoController {

	@Autowired
	private IGreetService service;
	
//	@GetMapping("/greetings")
//	public String getWish(Map<String,Object> map) {
//		
//		Object msg=service.getGreetings("john");
//		map.put("g1", msg);
//		return "greet1";		
//	}
	
	@GetMapping("/greet1")
	public void getWish(Map<String,Object> map) {
				
		map.put("g1", service.getGreetings("john"));
		return;		
	}
	
//	@PostMapping("/greet1")//valid
//	public void getWish1(Map<String,Object> map) {
//				
//		map.put("g1", service.getGreetings("john"));
//		return;		
//	}
	
	@GetMapping("/greet2")
	public Map<String,Object> getWish() {
		Map<String,Object> map =new HashMap<>();	
		map.put("g2", service.getGreetings("cris"));
		
		return map;		
	}
	
	@GetMapping("/greet3")
	public void getWish(HttpServletResponse response) throws IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1> This response directly coming from controller using servlets "+service.getGreetings("Mark")+"</h1>");
		
	}
	

	
	
}