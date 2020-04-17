package com.bth.tests;

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
}
