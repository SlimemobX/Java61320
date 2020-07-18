package com.syntax.class23_HWCW;

public class Circle extends Shape{
	
	public Circle(double radius) {
		super(radius);
	}
	
	public void displayArea() {
		double area;
		area = 3.14 * (radius * radius);
		System.out.println(area);
	}

}
