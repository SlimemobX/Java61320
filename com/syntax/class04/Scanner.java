package com.syntax.class04;



public class Scanner {
	public static void main(String[] args) {
		int a = 65;
		// init a = 33.4; // compile-time error
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Please write some text and press enter!");
		String text = scan.nextLine();
		System.out.println("-------------------");
		System.out.println(text);
		
		
		
		// let me read an integer
		System.out.println("Please enter your age! It should be a number!!!");
		int age = scan.nextInt(); // if not integer, run time error
		System.out.println("The age that you entered is " + age);
	}

}
