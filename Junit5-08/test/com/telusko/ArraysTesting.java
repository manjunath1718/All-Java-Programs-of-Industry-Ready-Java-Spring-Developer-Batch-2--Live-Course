package com.telusko;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting 
{

	@Test
	void testArrays() 
	{
		int []expected= {2,4,6,8};
		
		int []actual= {4,8,6,2};
		
		Arrays.sort(actual);// 2,4,6,8
		
		assertArrayEquals(expected, actual);
		//assertEquals(expected, actual);
	}

}
