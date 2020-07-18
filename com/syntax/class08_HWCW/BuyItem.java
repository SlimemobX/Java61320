package com.syntax.class08_HWCW;

import java.util.Scanner;

public class BuyItem {
	public static void main(String[] args) {
	
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
			money = scanner.nextDouble();
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
