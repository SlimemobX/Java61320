package com.syntax.class08;

import java.util.Scanner;

public class InClassTask {
	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		for (int a = 1; a <= 50; a++) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.println(a);
		}

		// Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an “yes” from a user program should stop asking.

		Scanner scan = new Scanner(System.in);

		for (int b = 0; b <= 10; b++) {

			System.out.println("Would you like to apply for a credit card?");
			String answer = scan.nextLine();
			if (answer.equals("yes")) {
				System.out.println("Congrats. Now you are in debt!");
				break;
			}
		}

	}

}
