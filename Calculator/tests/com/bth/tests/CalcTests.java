package com.bth.tests;

import com.bth.main.Calculator;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTests {

	@Test
	public void addTest() {
		
		assertEquals(4,Calculator.addition(2, 2));
		assertEquals(0,Calculator.addition(5, -5));
	}
	@Test
	public void subtest() {
		assertEquals(4, Calculator.subtraction(10, 6));
	}

	@Test
	public void mulTest() {
		assertEquals(0, Calculator.multiply(0, 2));
		assertEquals(15, Calculator.multiply(3, 5));
		assertNotEquals(15, Calculator.multiply(3, 4));
	}
	@Test
	public void divTest() {
		assertEquals(2, Calculator.divide(8, 4));
		assertNotEquals(2, Calculator.divide(6, 4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		Calculator.divide(4, 0);
	}

	// As a user I am going to calculate a POW b (a^b)
	@Test
	public void PowTest() {
		assertEquals(0, Calculator.PositivePow(0,20));
		assertEquals(1, Calculator.PositivePow(10,0));
		assertEquals(-1, Calculator.PositivePow(7,-5));
		assertEquals(7776, Calculator.PositivePow(6,5));
	}

}
