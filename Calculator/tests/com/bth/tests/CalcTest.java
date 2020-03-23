package com.bth.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bth.main.Calculator;

public class CalcTest {

	@Test
	public void addTest() {
		fail("Not yet implemented");
	//	assertEquals(4,Calculator.addition(2, 2));
	//	assertEquals(0,Calculator.addition(5, -5));
	}
	@Test
	public void subtest() {
		assertEquals(18,Calculator.subtraction(20, 2));
		assertEquals(0,Calculator.subtraction(-5, -5));
	}
	@Test
	public void mulTest() {
		assertEquals(4,Calculator.multiply(2, 2));
		assertEquals(-25,Calculator.multiply(5, -5));
	}
	@Test
	public void divTest() {
		assertEquals(1, Calculator.divide(2, 2), 0.1);
		assertEquals(3, Calculator.divide(15, 5), 0.1);
	}

}
