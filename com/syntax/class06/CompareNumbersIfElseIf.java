package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();
		
		System.out.println("Please enter the second number:");
		double b = scan.nextDouble();
		
		System.out.println("Please enter the third number:");
		double c = scan.nextDouble();
		
		
		double largest;
		
		
		
		// 1st way
//		if (a > b && a > c) {
//			largest = a;
//		}else if (b > a && b > c) {
//			largest = b;
//		}else if (c > a && c > b) {
//			largest = c;
//		}
		
		
		
		
//		// 2nd way
//		if (a > b && a> c) {
//			// a is the largest
//			largest = a;
//		}else if (b > c) { // a is not the largest, I am comparing b and c
//			// b is largest
//			largest = b;
//		}else { // a is not the largest, b is not the largest
//			// c is the largest
//			largest = c;
//		}
		
		if (a > b) {
			if (a > b) {
				// here a is already larger than b
				largest = a;
			}else {
				// a is larger than b, but c is larger than a
				largest = c;
			}
		}else {
			// here b is already larger than a 
			if (b > c) {
				// b is the largest
				largest = b;
			}else {
				// b is larger than a, but c i larger than b
				largest = c;
			}
		}
		
		
		System.out.println("Largest number is " + largest);

	}

}
