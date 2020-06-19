package com.syntax.class08;

import java.util.Scanner;

public class Homework8 {
	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a user 
		//and then from that range prints the sum of the even and odd integers.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a strarting number");
		int start = scan.nextInt();

		System.out.println("Please enter a ending number");
		int end = scan.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int s = start; s <= end; s++) {
			if (s % 2 == 0) { // even numbers
				sumEven += s;
				
			}else { // odd numbers
				sumOdd += s;
			}
			
		}
		
		System.out.println("The sum of even number is " + sumEven);
		System.out.println("The sum of odd number is " + sumOdd);
		
		
		
		// Write a program to ask a user to enter item they want to buy and the price of that item.
		// Every time user enters money accumulate the amount and tell the user how much is left to payoff.
		// If user give more money program should return a change.
		// Whenever a user done with payments program should say "Thank you for shopping!"
	
		Scanner scanner = new Scanner(System.in);
		double money;
		double totalAmount = 0;
		double remainingBalance;
		double change;
		
		System.out.println("Please enter the item you want to buy");
		String item = scanner.nextLine();
		System.out.println("Please enter the item's price");
		double price = scanner.nextDouble();
		
		do {
			System.out.println("please insert payment");
			money = scan.nextDouble();
			totalAmount += money;
			if (totalAmount < price) {
				remainingBalance = price-totalAmount;
				System.out.println("You are " + "$" + remainingBalance + " short please insert more money");
			}else if (totalAmount > price) {
				change = totalAmount - price;
				System.out.println("Your change is " + "$" + change);
			}
		}while (totalAmount < price);
		System.out.println("Thank you for shopping");
		
		
		
	
	
	} 

}
