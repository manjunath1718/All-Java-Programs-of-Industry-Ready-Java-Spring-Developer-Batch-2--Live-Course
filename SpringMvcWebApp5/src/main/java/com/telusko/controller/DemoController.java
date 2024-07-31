package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/home")
	public String showHomePage(){
		
		return "home";		
	}
	
	@GetMapping("/response")
	public String showSomeResponse(Model model){
		
		String[] books=new String[] {"Java","Spring","Sql"};
		model.addAttribute("books", books);
		
		for(String bookName:books) {
			System.out.println(bookName);
		}
		
		return "response";
		
	}
	
	
}