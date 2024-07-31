package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/info")//http://localhost:8484/info?name=raj ?key=value
	public String getSomeInfo(String name,Map<String,Object> map) {
		
		map.put("name","Hi "+name+" I hope You're fine and this is QueryParam example");
		return "index";
	}
	/*
	 * @RequestParam("name") is not mandatory if argument name and URL key name matches
	 */
	@GetMapping("/info1")//http://localhost:8484/info1?name=raj ?key=value
	public String getSomeInfo1(@RequestParam("name")String n,Map<String,Object> map) {
		
		map.put("name","Hi "+n+" I hope You're fine and this is QueryParam example");
		return "index";
	}
	
	@GetMapping("/info2")//http://localhost:8484/info2?name=raj&course=spring ?key=value&key=value
	public String getSomeInfo(@RequestParam("name") String n,String course,Map<String,Object> map) {
		
		map.put("name","Hi "+n+" I hope You're enjoying learning "+course);
		return "index";
	}
}
