package com.bth.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.bth.main.Calculator;

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
	@Ignore
	public void mulTest() {
		fail("Not yet implemented");
	}
	@Test
	@Ignore
	public void divTest() {
		fail("Not yet implemented");
	}

}
