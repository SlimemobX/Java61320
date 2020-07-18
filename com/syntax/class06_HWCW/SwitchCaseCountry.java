package com.syntax.class06_HWCW;

import java.util.Scanner;

public class SwitchCaseCountry {
	
	public static void main(String[] args) {
		
		// Ask user to enter their country and capture it. 
		// Once values are captured print which language user speaks.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		
		String language;
		
		switch (country) {
		
		case "United States":
			language = "English";
			break;
		case "Mexico":
			language = "Spanish";
			break;
		case "France":
			language = "French";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Russia":
			language = "Russian";
			break;
		default:
			language = "Invalid";
		
		}
	
	
		System.out.println("The user's language is " + language);
	
	
	
	
	
	
	
	}

}
