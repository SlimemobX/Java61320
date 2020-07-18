package com.syntax.class05_HWCW;

import java.util.Scanner;

public class AverageGrade {
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
	}

}
