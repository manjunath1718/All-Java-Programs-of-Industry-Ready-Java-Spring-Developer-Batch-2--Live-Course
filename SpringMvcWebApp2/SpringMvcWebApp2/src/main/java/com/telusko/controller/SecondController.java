package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c2")
public class SecondController {

	@GetMapping("/quote")
	public String getMessage(Model model) {
		
		model.addAttribute("focus", "Without focus we cannot master anything");
		return "focus";		
	}
	
}
