package com.codingpractice;

import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = scanner.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i <= num / 2; i++) {
			
			if (num % i == 0) {
				
				isPrime = false;
				
				break;
			}
		}
		
if (isPrime) {
	
	System.out.println(num + " is a prime number.");
	
} else {
	
	System.out.println(num + " is not a prime number.");
}
	}

}
