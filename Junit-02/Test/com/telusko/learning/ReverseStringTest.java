package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		
		ReverseString reverse=new ReverseString();
		
		assertEquals("Java",reverse.reverseString("avaJ"));
	}

}
