package com.syntax.class08_HWCW;

import java.util.Scanner;

public class SumEvenOdds {
	public static void main(String[] args) {
		
		// Write a program that reads a range of integers (start and end point), provided by a user 
				//and then from that range prints the sum of the even and odd integers.
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter a strarting number");
				int start = scan.nextInt();

				System.out.println("Please enter a ending number");
				int end = scan.nextInt();
				
				int sumEven = 0;
				int sumOdd = 0;
				
				for (int s = start; s <= end; s++) {
					if (s % 2 == 0) { // even numbers
						sumEven += s;
						
					}else { // odd numbers
						sumOdd += s;
					}
					
				}
				
				System.out.println("The sum of even number is " + sumEven);
				System.out.println("The sum of odd number is " + sumOdd);
	}

}
