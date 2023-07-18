package com.codingpractice;

public class SumOfOdds {

	public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all odd integers between 1 and 99 is " + sum);
    }
}
