package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/c1")
public class FirstController {

	@GetMapping("/info1")
	public String getInfo(Model model) {
		System.out.println("Model is implemented by "+model.getClass().getName());//BindingAwareModelMap
		model.addAttribute("names", "Virat,ABD,Warner are cricketers");
		return "home";//Logical View Name
	}
	
	@GetMapping("/info2")
	public String getTeamInfo(Model model) {
//		BindingAwareModelMap
//		System.out.println("Model is implemented by "+model.getClass().getName());
		model.addAttribute("teams", "RCB+CSK+MI");
		return "team";//LVN
	}
	
	@GetMapping("/quote")
	public String getQuote(Map<String,Object> map) {
		
		map.put("focus", "Focus is key to master any skill");
		return "focus";//LVN
	}
	
	@GetMapping("/focus")
	public void getQuote1(Map<String,Object> map) {
		
		System.out.println("Map is implemented by "+map.getClass().getName());//BindingAwareModelMap		
		map.put("focus", "Focus is key to master any skill");
		return ;//if view and end point name match we don't have to return anything
	}
	
	
	
}