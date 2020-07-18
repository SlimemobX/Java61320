package com.syntax.class23_HWCW;

public class AreaOfShapes {
//
//Create 1 class in which create a methods that will calculate the area (volume) of 
//Rectangle
//Square
//Box

	public int area(int length, int width) {
		return length * width;

	}

	public int area(int length) {
		return length * length;
	}

	public int area(int height, int length, int width) {
		return height * length * width;
	}

	public static void main(String[] args) {
		AreaOfShapes rectangle = new AreaOfShapes();
		System.out.println("The area of a rectangle = " + rectangle.area(4, 5));
		
		AreaOfShapes square = new AreaOfShapes();
		System.out.println("The area of a square = " + square.area(3));
		
		AreaOfShapes box = new AreaOfShapes();
		System.out.println("The area of a box = " + box.area(2, 3, 6));

	}

}
