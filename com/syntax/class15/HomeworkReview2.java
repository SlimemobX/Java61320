package com.syntax.class15;

import java.util.Scanner;

public class HomeworkReview2 {
	public static void main(String[] args) {
//		Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY

//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's first name? ");
		String momName = scan.next();
		System.out.println("Dad's first name? ");
		String dadName = scan.next();
		System.out.println("Boy or Girl? ");
		String babyGender = scan.next();
		
		String babyGender1 = "boy";
		String babyGender2 = "girl";
		
		String boyName = dadName.substring(0,dadName.length()/2) + momName.substring(momName.length()/2);
		String girlName = momName.substring(0, momName.length()/2) + dadName.substring(dadName.length()/2);
		
		
	
		
		if (babyGender.toLowerCase().equals(babyGender1)) {  // could use .equalsIgnoreCase();
			String com = (boyName).toUpperCase();
			System.out.println("Suggested baby name: " + com);
		}else if (babyGender.equalsIgnoreCase(babyGender2)){ // could use .toLowerCase();
			 
			String com2 = (girlName).toUpperCase();	
			System.out.println("Suggested baby name: " + com2);
			
		}else {
			System.out.println("Unknown");
		}
	}

}
