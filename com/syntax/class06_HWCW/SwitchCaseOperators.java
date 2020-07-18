package com.syntax.class06_HWCW;

import java.util.Scanner;

public class SwitchCaseOperators {
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
	

	
	
	
	
	
	}


}
