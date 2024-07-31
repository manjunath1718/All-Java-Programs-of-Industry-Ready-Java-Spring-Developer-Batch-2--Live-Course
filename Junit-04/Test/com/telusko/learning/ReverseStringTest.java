package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString reverse=new ReverseString();
	@Test
	void testReverseString_OneWord() {
		
		String str="Java";
//		assertTrue(str.length()<6);
		assertFalse(str.equals("java"));		
		assertEquals("avaJ",reverse.reverseString(str));
		System.out.println("Test case method is running");
		
	}
	
	@Test
	void testReverseString_MultipleWords(){
		
		
		assertEquals("ysae si avaJ",reverse.reverseString("Java is easy"));
	}

}
