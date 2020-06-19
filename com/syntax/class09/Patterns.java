package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {
		// I want to print this pattern
		// *****
		// *****
		// *****
		// *****

		// silly way, Not nested loop
//		for (int a = 1; a <= 4; a++) {
//			System.out.println("*****");
//		}
//		
//		
//		
//		System.out.println("Another silly way");
		for (int b = 1; b <= 5; b++) {
			System.out.print("*");
		}
		System.out.println();
		for (int b = 1; b <= 5; b++) {
			System.out.print("*");
		}
		System.out.println();
		for (int b = 1; b <= 5; b++) {
			System.out.print("*");
		}
		System.out.println();
		for (int b = 1; b <= 5; b++) {
			System.out.print("*");
		}
		System.out.println();
		

		
		
		
		
		System.out.println("-------1st way---------");
		for (int c = 1; c <= 4; c++) {
			for (int d = 1; d <= 5; d++) {
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println("--------2nd way---------");
		for (int e = 4; e >= 1; e--) {
			for (int f = 1; f <= 5; f++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("-------------task 10x10------------");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

}
