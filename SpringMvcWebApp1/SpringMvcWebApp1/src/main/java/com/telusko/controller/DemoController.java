package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/info1")
	public ModelAndView getSomeInfo() {
	 
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "Welcome to SpringMVC Web App1");
		mav.setViewName("index");
		return mav;		
	}
	
//	@RequestMapping(value="/info2",method=RequestMethod.POST)
	@RequestMapping("/info2")
	public ModelAndView getSomeMoreInfo() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "SpringMVC Web App1(Jar-->War) deployed on tomcat server");
		mav.setViewName("index");
		return mav;		
	}
	
	
}
