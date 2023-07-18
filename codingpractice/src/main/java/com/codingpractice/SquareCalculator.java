package com.codingpractice;

public class SquareCalculator {

	public static double calculateSquare(double number) {
		return number * number;
		
	}
}

public class Main {
	public static void main(String[] args) {
		double number = 4;
		
		double square =
				SquareCalculator.calculateSquare(number);
		System.out.println("Square: " + square);
		
	}
}