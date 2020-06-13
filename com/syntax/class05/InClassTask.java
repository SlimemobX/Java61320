package com.syntax.class05;

import java.util.Scanner;

public class InClassTask {
	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//• short (under 60 inch)
		//• medium(between 60 -72 inch)
		//• tall (over 72 inch)
		
		Scanner height = new Scanner(System.in);
		System.out.println("What is your hieght in inches?");
		
		double num = height.nextDouble();
		if (num >= 0 && num <= 60) {
			System.out.println("They are short");
		}else if (num >= 60 && num <= 72) {
			System.out.println("You are medium");
		}else if (num > 72) {
			System.out.println("You are tall");
		} else {
			System.out.println("You don't Exist");
		}
		
		
		System.out.println("---------------------------------");
		
		
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 → output "It is a weekday", 
		//anyday from 6-7 → output "It is a weekend", 
		//any other day → output "Invalid day"
		
		int day = 3;
		if (day >= 1 && day <=5) {
			System.out.println("It's a weekday");
		}else if (day >= 6 || day <= 7) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("Invalid day");
		}
	
		
	}

}
