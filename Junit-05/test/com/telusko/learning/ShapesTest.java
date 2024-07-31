package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testcomputeSquareArea() 
	{

		
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	/*
	 * even if test case pass message will get evaluated but it will not give message
	 */
	@Test
	void testcomputeCicleArea()
	{
		assertEquals(78.5, shape.computeCircleArea(5), "Ares of circle calculation is wrong");
	}

	/*
	 * in below method Supplier Functional interface method is overridden with lambda expression
	 * if test case is pass that will not get evaluated if test case is fail then it will
	 * evaluated and give message to developer 
	 * It will perform lazy evaluation
	 * 
	 */
	@Test
	void testcomputeCircleArea_Supplier()
	{
		assertEquals(78.5, shape.computeCircleArea(5), ()->"Area of circle calculation is wrong");
	}
}
