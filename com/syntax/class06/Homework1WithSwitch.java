package com.syntax.class06;

import java.util.Scanner;

import java.util.Scanner;

public class Homework1WithSwitch {
		public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter your birth month");
			String month = scan.next();
			
			String season = "Unknown";

			switch (month) { // .toLowerCase() converts December -----> december
			
			case "December":				
			case "January":				
			case "February":
				season = "Winter";
				break;
			case "March":
			case "April":
			case "May":
				season = "Spring";
				break;
			case "June":
			case "July":
			case "August":
				season = "Summer";
				break;
			case "September":
			case "October":
			case "November":
				season = "Fall";
				break;
			default:
				season = "Unknown";
				
			
			}
			
			System.out.println("You were born in " + season);
			
//			if (month.equals("December") || month.equals("January") || month.equals("February")) {
//				season = "Winter";
//			}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
//				season = "Spring";
//			}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
//				season = "Summer";
//			}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
//				season = "Fall";
//			}else {
//				season = "unknown";
//			}
//			
//			System.out.println("You were born in " + season);
			
			
   }
}
