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
	public static int divide(int number, int by) {
		if(by == 0)
			throw new IllegalArgumentException("Can not divide by zero!");
		return number / by;
	}
	public static int PositivePow(int a, int b) {
		int PowResult = 1;
		if (a == 0)
			PowResult = 0;
		else if ( b < 0)
			PowResult = -1;
		else
			for (int i = 1; i <= b; i++)
				PowResult *= a;
		return PowResult;
	}
}
