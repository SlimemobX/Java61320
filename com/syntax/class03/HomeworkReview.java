package com.syntax.class03;

public class HomeworkReview {

	public static void main(String[] args) {
		
		double num1 = 3.5, num2 = 4.2;
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("The addition os 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);

		System.out.println("The addition os 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
		

		System.out.println("The subtraction os 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		

		System.out.println("The multiplication os 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);

		System.out.println("The multiplication os 2 numbers " + num1 + " and " + num2 + " is equal to " + num1 * num2);
		

		System.out.println("The division os 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		
		
		System.out.println("-------------------");
		
		double number = 3.9;
		System.out.println("The square of the " + 3.9 + " is " + number * number);
		
		System.out.println("----------------");
		
		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area is " + area);

		
	}
}
