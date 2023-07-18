package com.codingpractice;

public class SquareRootCalculator {
	public static double
	calculateSquareRoot(double number) {
		return Math.sqrt(number);
	
	}

}

public class Main {
	public static void main(String[] args) {
		double number = 16;
		
		double squareRoot =
				SquareRootCalculator.calculateSquareRoot(number);
		
		System.out.println("Square Root: " + squareRoot);
	}
}