package com.syntax.class04;

public class ScannerSample {

	public static void main(String[] args) {
	// capture the name from the user print
	// your name is ______
	// Ask the user to enter the age and print
	// your name is ____ and age is	
		
		// 1. We bring the scanner class to our program
		// System ---> input
		java.util.Scanner input = new java.util.Scanner(System.in);

		// We are instructing the user what to enter
		System.out.println("Please enter your full name");
		// We are capturing the whole line into a text variablel
		String name = input.nextLine();
		System.out.println("Your name is " + name);
		
		// We are instructing the user what to enter 
		System.out.println("Please enter your name as double");
		// We are capturing the text as a double
		// if it is not a double, then an error/exception will be printed
		double albanianAge = input.nextDouble();
		System.out.println("Your name is " + name + " age is " + albanianAge);
		
		
	}
		
		
		
	

}
