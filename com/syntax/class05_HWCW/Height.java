package com.syntax.class05_HWCW;

import java.util.Scanner;

public class Height {
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
	}

}
