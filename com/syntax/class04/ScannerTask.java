package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		
		
		// you are a loan specialist and you need to ask user what is the amount of loan is needed
		//if loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");
		int loanAmount = scan.nextInt();
		if (loanAmount <= 200000) {
			System.out.println("The loan was be approved");
		}else {
			System.out.println("The client has been rejected");
		}
		
		
		
		System.out.println("------------------------------");
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
		
		Scanner dmv = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = dmv.nextInt();
		if (age >= 18) {
			System.out.println("You will recieve your licnese");
		}else {
			System.out.println("You must get your learner's permit first");
		}
		
				
		System.out.println("-------------------------------");
		//Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"
		
		Scanner weather = new Scanner(System.in);
		System.out.println("What city do you live in?");
		String city = weather.nextLine();
		System.out.println("What's the temperature in you city?");
		double fah = weather.nextDouble();
		double cel = (fah - 32) * 5/9;
		System.out.println("The temperature in the city of " + city + " is " + cel );
		
		
		System.out.println("--------------------------");
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

		
		
		System.out.println("-------------------------");
		//Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		Scanner job = new Scanner(System.in);
		System.out.println("How many years have you worked?");
		int num1 = job.nextInt();
		System.out.println("What is your annual salary?");
		int num2 = job.nextInt();
		
		if (num1 >= 5) {
			if (num2 >= 50000) {
				System.out.println("The employee will recieve a bonus of 5000");
			}else {
				System.out.println("If not, the employee will receive a bounus of 3000 ");
			}
		}else {
			System.out.println("Employee is not eligible for bonus");
		}
		
	}

}
