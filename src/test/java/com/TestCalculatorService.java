package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	int x = 20, y = 10, p = 3, s=36;
	CalculatorService cs = new CalculatorService();

	@Test
	void testAdd() {
		Assertions.assertEquals(30, cs.add(x,y));
	}
	
	@Test
	void testSubtract() {
		Assertions.assertEquals(10, cs.subtract(x,y));
	}
	
	@Test
	void testMultiply() {
		Assertions.assertEquals(200, cs.multiply(x,y));
	}
	
	@Test
	void testDivide() {
		Assertions.assertEquals(2, cs.divide(x,y));
	}
	
	@Test
	void testPower() {
		Assertions.assertEquals(8000, cs.power(x,p));
	}
	
	@Test
	void testSquareRoot() {
		Assertions.assertEquals(6, cs.squareRoot(s));
	}

}
