package com.syntax.class03;

public class ElseIfCondition {
	public static void main(String[] args) {
		double d1 = 10.7;
		double d2 = 10.7;
		
		if (d1 > d2) {
			System.out.println("number1 is larger than number2");
		
		}else if (d1 < d2) {
			System.out.println("number1 is smaller than number2");
		}else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("---Different way---");
		
		if (d1 > d2) {
			System.out.println("number1 is larger than number2");
		
		}else if (d1 < d2) {
			System.out.println("number1 is smaller than number2");
		}else {
			System.out.println("Numbers are equal");
		} {
			System.out.println("You will never come here!"); 
		
		}
			System.out.println("We are done");
		
	
	System.out.println("------------------");
	int day = 7;
	
	if (day == 1) {
		System.out.println("Monday");
	}else if (day == 2) {
		System.out.println("Tuesday");
	}else if (day == 3) {
		System.out.println("Wednesday");
	}else if (day == 4) {
		System.out.println("Thursday");
	}else if (day == 5) {
		System.out.println("Friday");
	}else if (day == 6) {
		System.out.println("Saturday");
	}else if (day == 7) {
		System.out.println("Sunday");
	}else { 
		System.out.println("Invalid Day");
	}
	
	
	
	}

}
