package com.syntax.class09;

public class Homework9For3And4 {
	public static void main(String[] args) {
		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****
		
	
		
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				
				System.out.print("*");
			}
		System.out.println();
		}
				
	System.out.println("--------------------------------");	
		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1
		
		for (int c = 5; c >= 1; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print(c);
			}
		System.out.println();
		}
	}

}
