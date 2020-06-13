package com.syntax.class02;

public class ArithmeticHomework {
	
	public static void main(String[] args) {
		
		/* Write a java program to add, subtract, multiply, and divide 2 decimal values
		 * Your program should say: "The ___ of 2 numbers __ and __ is equal to ___"
		 */
		
		double dub1 = 15.9;
		double dub2 = 7.7;
		double dubsum = dub1 + dub2;
		double dubsub = dub1 - dub2;
		double dubmult = dub1 * dub2;
		double dubdiv = dub1 / dub2;
		
		System.out.println("The addition of 2 numbers " + dub1 + " and " + dub2 + " is equal to " + dubsum);
		System.out.println("The subtraction of 2 number " + dub1 + " and " + dub2 + " is equal to " + dubsub);
		System.out.println("The multiplication of 2 number " + dub1 + " and " + dub2 + " is equal to " + dubmult);
		System.out.println("The division of 2 number " + dub1 + " and " + dub2 + " is equal to " + dubdiv);
		
		System.out.println("----------------------------");
		
		/* Write program to find the square of the number 3.9
		 * Your program should say: "The square of the ___ is ___"
		 */
		
		double square = 3.9;
		double squaremult = square * square;
		
		System.out.println("The square of the " + square + " is " + squaremult);
		
		System.out.println("----------------------------");
		
		/* Write the program to print the area and Perimeter of a with width = 5 and height = 8
		 * Your program should say: "The perimeter of a rectangle with width ____ and height ____ is equal to _____ and the area is ____"
		 */
		
		double width = 5;
		double height = 8;
		double perimeter = 2; 
		double perimetersum = (perimeter * width) + (perimeter * height);
		double areamult = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimetersum + " and the area is " + areamult);
		
	}

}
