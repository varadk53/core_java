package com.codingpractice;

import java.util.Scanner;

public class DecideGrade {
	public static void main(String[] args) {
		
		Scanner ramesh = new Scanner(System.in);
		
		System.out.print("Enter your score: ");
		
		int score = ramesh.nextInt();
		
		char grade;
		
		if (score >= 90) {
			grade =  'A';
		
		} else if (score >= 80) {
			grade = 'B';
			
		} else if (score >=70) {
			grade = 'C';

		} else if (score >= 60) {
			grade = 'D';
			
		} else {
			grade = 'F';
			
		}
		System.out.println("Your grade is: " + grade);
	}

}
