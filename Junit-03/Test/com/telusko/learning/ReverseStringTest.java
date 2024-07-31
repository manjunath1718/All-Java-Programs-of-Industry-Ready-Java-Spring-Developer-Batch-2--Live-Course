package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	/*
	 * In Junit5 methods with @Test annotation could be public,default,protected
	 * but in junit4 methods with @Test annotation could be public only
	 */
	@Test
	void test() {
		
		ReverseString reverse=new ReverseString();
		
		assertEquals("avaJ", reverse.reverseString("Java"));
		assertEquals("neilA", reverse.reverseString("Alien"));
	}

}
