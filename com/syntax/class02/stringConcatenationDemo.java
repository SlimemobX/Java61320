package com.syntax.class02;

public class stringConcatenationDemo {

	public static void main(String[] args) {
		// I love Castro
		// Put space in front of Castro
		String name = " Castro";
		
		System.out.println("I Love" + name);
		
		// Space after I love
		String name2 = "Castro";
		
		System.out.println("I Love " + name2);
		
		// Put space in between qoutes 
		String name3 = "Castro";
		
		System.out.println("I love" + " " + name3);
		
		String statement = "I Love";
		
		// I don't want to change my variable
		System.out.println(statement + " " + name3);
		
		System.out.println("-------------");
		
		String car = "BMW";
		int year = 2020;
		System.out.println(name2 + " has a " + car + " of year " + year);
		
		// Concatenation of two Strings
		System.out.println("BMW of year " + "2020");
		
		// Concatenation of a String with an integer
		System.out.println("BMW of year " + 2020);
		
		//Concatenation of a string with an variable of type integer
		System.out.println("BMW of year " + year);
		
		//Concatenation  multiple things
		System.out.println(car + " of year " + year);
		
		
				
		
	}
}
