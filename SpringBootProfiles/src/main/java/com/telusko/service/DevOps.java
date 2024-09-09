package com.telusko.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("devOps")
public class DevOps implements Course {

	@Override
	public boolean buyCourse(Double cost) {
		
		System.out.println("DevOps course is purchased and cost is "+cost);
		return true;
	}

}
