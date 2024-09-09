package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"sb","advjava"})
public class SpringBoot implements Course {

	@Override
	public boolean buyCourse(Double cost) {
		
		System.out.println("SpringBoot course is purchased and cost is "+cost);
		return true;
	}

}
