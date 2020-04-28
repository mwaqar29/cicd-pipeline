package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestStringManipulationService {
	
	String s1 = new String("Hello");
	String s2 = new String("World");

	StringManipulationService sms = new StringManipulationService();
	
	@Test
	void testStrEquality() {
		Assertions.assertEquals(false, sms.isStrEqual(s1,s2));
	}
	
	@Test
	void testLength() {
		Assertions.assertEquals(5, sms.getLength(s1));
	}
	
	@Test
	void testConcatStr() {
		Assertions.assertEquals("HelloWorld", sms.concatStr(s1, s2));
	}

}
