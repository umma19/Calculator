package com.bth.tests;

import com.bth.main.Areas;
import com.bth.main.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IntegrationTest {

	// We are going to calculate [ ( (37 + 13) / (42 - 17) ) ^ (2 * 3) ]
	@Test
	public void IntegTest() {
		assertEquals(64, Calculator.PositivePow(
				Calculator.divide( Calculator.addition(37,13), Calculator.subtraction(42,17)),
				Calculator.multiply(2,3)));
	}
	
	// Integration test for area of a triangle using arithmetic operations from Calculator class
	@Test
	public void triangleArea() {
		
		assertEquals(12, Areas.Triangle(6, 4));
	}
	
	// Integration test for area of a rectangle using arithmetic operations from Calculator class
	@Test
	public void rectangleArea() {
		
		assertEquals(36, Areas.Rectangle(9, 4));
		assertNotEquals(12, Areas.Rectangle(10, 4));
		
	}
	// Integration test for area of a square using arithmetic operations from Calculator class
	@Test
	public void squareArea() {
		
		assertEquals(36, Areas.Square(6));
		assertEquals(4, Areas.Square(2));
	}

	
	
}
