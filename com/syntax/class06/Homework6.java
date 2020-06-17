package com.syntax.class06;

import java.util.Scanner;

public class Homework6 {
		// HomeWork: Using scanner class create calculator. 
		// Allow user to enter 2 numbers and operator(+,-,*,/). 
		// Based on operator provide the result to user.

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("Enter an operator (+,-,*,/): ");
		char operator = scan.next().charAt(0);
		
		scan.close();
		int output = 0;
		
		switch (operator) {
		case '+':
			output = (num1 + num2);
			break;
		case '-':
			output = (num1 - num2);
			break;
		case '*':
			output = (num1 * num2);
			break;
		case '/':
			output = (num1 / num2);
			break;
		default:
			System.out.println("Entered wrong operator");
			
		}
		
	System.out.println(num1 + " " + operator + " " + num2+ ": " + output);
	
	
	
	System.out.println("------------Grades------------------");
	
	
	// Allow user to enter grade and then provide explanation: 
	// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
	// At the end your program should print which grade was entered by a user with explanation.
	
	Scanner school = new Scanner(System.in);
	
	System.out.println("Please enter grade: ");
	char grades = school.next().charAt(0);
	
	String explanation;
	
	switch (grades) {
	case 'A':
		explanation = "Excellent";
		break;
	case 'B':
		explanation = "Good";
		break;	
	case 'C':
		explanation = "Average";
		break;
	case 'D':
		explanation = "Bad";
		break;
	default:
		explanation = "Not Acceptable";
	
	}

	System.out.println("The grade entered is " + grades + " and explanation is " + explanation);
	
	
	}


}
