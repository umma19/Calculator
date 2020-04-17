package com.bth.main;

public class Areas {

	
	public static int Triangle(int base, int altitude) {
				
		return Calculator.divide((Calculator.multiply(base, altitude)),2);
	}
	
	public static int Rectangle(int length, int width) {
		
		return Calculator.multiply(length, width);
	}
	
	public static int Square(int length) {	
		return Calculator.PositivePow(length, 2);
	}
}

