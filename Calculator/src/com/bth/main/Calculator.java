package com.bth.main;

public class Calculator {

	public static int addition(int a, int b) {
	
		return a + b;
	}
	public static int subtraction(int from, int number) {
		
		return from - number;
	}
	public static int multiply(int a, int b) {
		
		return a * b;
	}
	public static double divide(int number, int by) {
		if(by == 0)
			throw new IllegalArgumentException("Can not divide by zero!");
		return (double) number / by;
	}
	
}
