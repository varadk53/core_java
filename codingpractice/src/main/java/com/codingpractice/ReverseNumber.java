package com.codingpractice;
import java.util.Scanner;

class ReverseNumber {

	public static void main(String[] args) {
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		num = sc.nextInt();
		
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
			
		}
		
		System.out.println("Reversed Number: " + reversed);
		
	}
}
