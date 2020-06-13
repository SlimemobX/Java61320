package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		// Declare a number a compare if the number is larger than 100
		// if it larger than 100, I will print --> my number is large
		
		int num = 178;
		
		boolean result = num > 100;
		
		System.out.println("let us check");
		
		if (num > 100) {
	
		System.out.println("My number is large");
		
		} else {
			System.out.println("My number is small");
		}
		
		System.out.println("The check is complete");
		
		//boolean result = num > 100;
		//if (result) {
		//	System.out.println("The result is true");
	//	}
		
		System.out.println("-------------------");
		int expectedHours = 15;
		int actualHours = 20; 
		
		if (actualHours >= expectedHours) {
			System.out.println("I will love Java");
		} else {
			System.out.println("I will not love Java");
		}
		

		System.out.println("-------------------");
		double budget = 15000;
		double carPrice = 15000;
		
		if (budget > carPrice) {
			System.out.println(" I will buy this car");
			System.out.println("I am happy");
		} else { // otherwise
			System.out.println("I will not buy this car");
			System.out.println("i will study Java");
			System.out.println("I will find a job");
			System.out.println("Then,  I will have money");
		}
		
		
	}

	

}
	

