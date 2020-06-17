package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	
	public static void main(String[] args) {
		// we want to ask users name 5 times and print Good Afternoon ___ 5 times
		
		Scanner scan = new Scanner(System.in);
		
////		int n = 1;
////		
////		
////		while (n <= 5) {
////		System.out.println("Please enter your name:");
////		String name = scan.nextLine();
////		
////		System.out.println("Good Afternoon " + name);
////		n++;	
//		
//		}
		
		int n2 = 1;
		
		 do {
			System.out.println("Please enter your name:");
			String name = scan.nextLine();
			
			System.out.println("Good Afternoon " + name);
			n2++;	
			
		 } while (n2 <= 5);
		
	

	}

}
