package com.codingpractice;

public class CompoundInterestCalculator {

	public static double 
	calculateCompoundInterest(double principal, double rate, double time, int n) {
		return principal * Math.pow(1 + (rate /n), n * time);
	  }
	
	}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double principal = 000;
double rate = 5;
double time = 2;
int n = 12;

double inetrest =
CompoundInterestCalculator.calculateCompundInterest
(principal, rate, time, n);
 System.out.println("Compound Interest: " + interest);
 
	}
}

