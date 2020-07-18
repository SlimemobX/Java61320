package com.syntax.class02_HWCW;

public class AreaPerimeter {
	public static void main(String[] args) {
		

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
