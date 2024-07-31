package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.telusko.learning.Shapes;

//if we use @TestInstance(TestInstance.Lifecycle.PER_CLASS) only one object is getting created to invoke every test method
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAllAfterALl {
	
	TestBeforeAllAfterALl(){
		
		System.out.println("Test object is created before Test method");
		
	}
	
	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before all test");
	}
	
	@AfterAll
	static void afterAll()
	{
		System.out.println("test all test");
	}
	
	Shapes shape;
	
	@BeforeEach
	 void init()
	{
		shape=new Shapes();
		System.out.println("Before test");
	}

	@Test
	void testComputeSquareArea() 
	{
		
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
		
	}
	
	@Test
	void testComputeCircleArea() 
	{
		
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
		
	}
	
	@AfterEach
	void destroy()
	{
		System.out.println("After test clean up");
	}

}
