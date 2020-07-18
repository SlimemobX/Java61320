package com.syntax.class04_HWCW;

import java.util.Scanner;

public class AnnualSalary {
	public static void main(String[] args) {
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
