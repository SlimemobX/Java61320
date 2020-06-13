package com.syntax.class05;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		//Create a Java program that will ask if user has a credit card or not. 
				//If your user does not have a credit card then offer them. 
				//If they do have one ask what is balance on the card? 
				//If balance of the card is larger than 1000, tell them to pay off immediately, 
				//otherwise you can tell them that they can spend more.
		
		Scanner scan = new Scanner(System.in);
		boolean cc;
		
		System.out.println("Do you have a credit card? (true or false)");
		cc = scan.nextBoolean();
		
		if (cc) {
			System.out.println("What is your credit card balance?");
			
			double balance = scan.nextDouble();
			
			if (balance > 1000) {
				System.out.println("please Pay off immediately");
			}else {
				System.out.println("you can spend more");
			}
			
		}else {
			System.out.println("Do you want to apply for our credit card?");
		}
		
		
		//Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Please enter your number of working year");
		int years = scan.nextInt();
		
		System.out.println("Please enter your annual salary");
		double salary = scan.nextDouble();
		
		if (years >= 5) {
			System.out.println("You're eligible for the bounus");
			
			if (salary > 50000) {
				System.out.println("You will get a 5000 bounus");
			}else {
				System.out.println("You will get 3000 bonus");
			}
		}else {
			System.out.println("You'er not eligible for the bounus");
		}
		
	}

}
