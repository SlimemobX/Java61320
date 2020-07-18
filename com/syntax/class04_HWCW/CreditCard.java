package com.syntax.class04_HWCW;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
		
		//Create a Java program that will ask if user has a credit card or not. 
				//If your user does not have a credit card then offer them. 
				//If they do have one ask what is balance on the card? 
				//If balance of the card is larger than 1000, tell them to pay off immediately, 
				//otherwise you can tell them that they can spend more.
						
				Scanner creditCard = new Scanner(System.in);
				System.out.println("Do you have a credit card?");
				String card = creditCard.nextLine();
				
				
				if (card.equals("no")) {
					System.out.println("Would you like to apply for a credit card?");
				}else {
					System.out.println("What is your balance on the card?");
					}		
				int balance = creditCard.nextInt();
						 if (balance > 1000) {
						System.out.println("You should pay your card off immediately");
					} else {
						System.out.println("You can spend more");
					}
	}

}
