package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		// we have 7 days of week 
		// if day is 2,4 ----> SDLC class
		// if day i 6,7 ---- Java class
		// if day is 3 ---> Review class
		// if day is 1,5 ---> no class
		
		int day = 5;
		// To compare the equality of two numbers we use == 
		
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		}else if (day == 6 || day == 7) {
			System.out.println("Java class");
		}else if (day == 1 || day == 5) {
			System.out.println("No class");
		}else if (day == 3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Wrong day");
		}
		
		
		System.out.println("-------------------Using String--------------");
		
		
		// To compare the equality of two string we use .equals()
		
		String day2 = "Tuesday";
		
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if (day2.contentEquals("Saturday") || day2.contentEquals("Sunday")) {
			System.out.println("Java class");
		}else if (day2.contentEquals("Monday") || day2.contentEquals("Friday")) {
			System.out.println("No class");
		}else if (day2.contentEquals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Wrong day");
		}
		
		
		
		
	
		
	}

}
