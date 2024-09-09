package com.telusko.service;

public class Mockito implements Course {

	@Override
	public boolean buyCourse(Double cost) {
		
		System.out.println("Mockito course is purchased and cost is "+cost);
		return true;
	}

}
