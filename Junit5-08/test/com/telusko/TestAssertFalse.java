package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertFalse {

	@Test
	void test() {
		String str="Junit";
		assertFalse(str.equals("JUNIT"));
	}

}
