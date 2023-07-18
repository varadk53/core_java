package com.codingpractice;

public class NumberPattern1 {

	public static void main(String[] args) {
		for (int i = 2; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}
