package com.syntax.class05;

import java.util.Scanner;

public class HwCw {
	public static void main(String[] args) {
		
	// Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
	//	if the average score >=90 → grade=A
	//	if the average score >= 70 and <90 → grade=B
	//	if the average score>=50 and <70 → grade=C
	//	if the average score<50 → grade=F
		
		Scanner scores = new Scanner(System.in);
		
		System.out.println("Please enter the quiz score");
		int quiz = scores.nextInt();
		System.out.println("Please enter the mid term score");
		int midTerm = scores.nextInt();
		System.out.println("Please enter the final score");
		int finalScore = scores.nextInt();
		
		int average = (quiz + midTerm + finalScore) / 3;
		
		if (average >= 90) {
			System.out.println("Your grade will be an A");
		} else if (average >= 70 && average < 90) {
			System.out.println("Your grade will be a B");
		}else if (average >= 50 && average < 70) {
			System.out.println("Your grade will be a C");
		}else if (average < 50)	{
			System.out.println("Your grade is a F");
		}else {
			System.out.println("You did not do any of the assignments");
		}		
		System.out.println("---------------------------------------------");		
	//	Write a program for user to enter his/hers birth month. Based on the month define the season.
	//	Example: if user is born in June, July or August → season ="Summer".
	//	At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		String month = scan.next();
		String season;
		
		if (month.equals("December") || month.equals("January") || month.equals("Febuary") ) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";	 
		}else {
			season = "Month is invalid";
		}
		
		System.out.println("You were born " + season);
	
	}
}
