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
	public String home() {
		
		return "register";
	}
	
//	@PostMapping("/")
//	public String register(@ModelAttribute HttpServletRequest request) {
//		request.getParameter("id");
//		request.getParameter("name");
//		request.getParameter("salary");
//		request.getParameter("city");
//		return "response";
//	}
	
	@PostMapping("/register")
	public String register(Model model,@ModelAttribute Implementer impl) {
		
		model.addAttribute("impl",impl);
		return "response";
	}
	
	
	
}