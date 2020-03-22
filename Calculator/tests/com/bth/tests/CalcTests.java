package com.bth.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.bth.main.Calculator;
import org.junit.rules.ExpectedException;

public class CalcTests {

	@Test
	public void addTest() {
		
		assertEquals(4,Calculator.addition(2, 2));
		assertEquals(0,Calculator.addition(5, -5));
	}
	@Test
	@Ignore
	public void subtest() {
		fail("Not yet implemented");
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
