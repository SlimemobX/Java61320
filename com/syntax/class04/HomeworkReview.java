package com.syntax.class04;

public class HomeworkReview {
	public static void main(String[] args) {
		// Task 2:
		int num = 79;
		if (num > 0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
	// 1st way
		int num2 = 0;
				if (num > 0) {
					System.out.println("Number is positive");
				}else if (num2 < 0) {
					System.out.println("Number is negative");
				}else {
					System.out.println("Number is Zero");
				}
		
				
				
	// 2nd way			
		int num3 = 0;
		if (num3 > 0) {
			System.out.println("Number is positive");
		}else if (num3 == 0) {
			System.out.println("Number is zero");
		}else {
			System.out.println("Number is negative");
		}
	
	// Task 3:
		int num4 = 123;
		int remainder = num4 % 2;
		 if (remainder == 0) {
			 System.out.println(num4 + " is even");
		 }else { 
			 System.out.println(num4 + " is odd");
		 }
	
	
	
	}

}
