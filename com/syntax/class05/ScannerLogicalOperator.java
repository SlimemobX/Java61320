package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperator {
	public static void main(String[] args) {
		// Take the age from the user and then print
		// if age is between 0-3 --> you are a baby
		// if age is between 4-5 --> you are a kid
		// if age is between 6-12 --> you are a child
		// if age is between 13-19 --> you are a teenager
		// if age is between 20-64 --> you are an adult
		// if age is more than or equal to 65 --> Enjoy life
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what is your age?");
		int age = scan.nextInt();
		
		if (age >= 0 && age <= 3) {
			System.out.println("You are baby");
		}else if (age >= 4 && age <= 5) {
			System.out.println("You are a kid");
		}else if (age >= 6 && age <= 12) {
			System.out.println("You are a child");
		}else if (age >= 13 && age <= 19) {
			System.out.println("you are a teenager");
		}else if (age >= 20 && age <= 64) {
			System.out.println("You are n adult");
		}else if (age > 65){
			System.out.println("Enjoy life :)");
		}else {
			System.out.println("That wasn't a correct age");
		}
		
		
	}

}
