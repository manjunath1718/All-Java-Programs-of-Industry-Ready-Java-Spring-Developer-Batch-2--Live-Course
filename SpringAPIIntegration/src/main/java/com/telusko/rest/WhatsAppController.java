package com.telusko.rest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.WhatsAppService;

@RestController
public class WhatsAppController {

//	@Autowired
	WhatsAppService service;
	
	public WhatsAppController(WhatsAppService service) {
		
		this.service=service;
	}
	
	@GetMapping("/send-message")
	public String sendMessage(@RequestParam String phoneNumber,@RequestParam String templateName,
			@RequestParam String[] templateParameters) {
			
		return service.sendTemplateMessage(phoneNumber, templateName,Arrays.asList(templateParameters));
		
	}
}
