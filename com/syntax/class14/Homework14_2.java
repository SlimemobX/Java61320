package com.syntax.class14;

import java.util.Scanner;

public class Homework14_2 {
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
		
		String dad = dadName.substring(0,3);
		String mom = momName.substring(2, 4);
		
		
		String dad2 = dadName.substring(3, 6);
		String mom2 = momName.substring(0, 2);
		
		
	
		
		if (babyGender.equals(babyGender1)) {
			String com = (dad+mom).toUpperCase();
			System.out.println("Suggested baby name: " + com);
		}else {
			if (babyGender.equals(babyGender2)) {
			String com2 = (mom2+dad2).toUpperCase();	
			System.out.println("Suggested baby name: " + com2);
			}
		}
		
		
		
	}

}
