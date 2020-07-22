package com.syntax.class11_HWCW;

public class SumOfArray {
	public static void main(String[] args) {
		
		System.out.println("---------Task 2------------");
		// create an array of integers and calculate the sum of all elements in an array

		int[] num = { 20, 30, 40, 50, 60 };
		int sum = 0;

		for (int num1 : num) {
			sum += num1;
		}
		System.out.println("The sum of all numbers is: " + sum);
	}

}
