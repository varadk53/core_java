package com.codingpractice;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of elements");
		
		int n = scanner. nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			
			sum += arr[i];
			
		}
		double average = (double) sum / n;
		
		System.out.println("The average is: " + average);
}
	

}
