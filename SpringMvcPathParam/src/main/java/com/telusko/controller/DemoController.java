package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	//http://localhost:8484/info1/raj
	@GetMapping("/info1/{name}")
	public String getInfo1(@PathVariable String name,Map<String,Object> map) {
		System.out.println(name);
		map.put("name","Hi "+name+" I hope you're fine and this is Path Param ex");
		
		return "index";
	}
	
	//http://localhost:8484/info1/raj/springboot
	@GetMapping("/info1/{n}/{course}")
	public String getInfo2(@PathVariable("n") String name,@PathVariable String course,Map<String,Object> map) {
		
		map.put("name","Hi "+name+" I hope you're enjoying learning "+course);
		
		return "index";
	}
	
	
}
