package com.syntax.class06_HWCW;

import java.util.Scanner;

public class SwitchCaseGrades {
	public static void main(String[] args) {
		
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
