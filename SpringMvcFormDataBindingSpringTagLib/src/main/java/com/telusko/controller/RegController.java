package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.Implementer;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RegController {

	@GetMapping("/register")
	public String home(@ModelAttribute("impl") Implementer impl) {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String register(Model model,@ModelAttribute("impl")Implementer impl) {
		
		System.out.println(impl);
		model.addAttribute("impl",impl);
		return "response";
	}
	
	
	
}