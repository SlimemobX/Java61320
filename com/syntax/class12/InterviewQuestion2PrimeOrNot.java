package com.syntax.class12;

import java.util.Scanner;

public class InterviewQuestion2PrimeOrNot {
	public static void main(String[] args) {
		System.out.println("----------------Prime or not------------------------");
		
	// Write a java program to check whether a given number is prime or not?
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number");
			int num = scan.nextInt();
			
			boolean num1 = false;
			for (int c = 2; c <= num/2; c++) {
				if (num % c == 0) {
					num1 = true;
					break;
				}
			}
			if (!num1) {
				System.out.println("It is a Prime number");
			}else {
				System.out.println("It is not a prime number");
			}
	}

}
