package com.syntax.class28_HWCW;

interface Shape {
	// Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. 
	// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
	
	void calculateArea(double r);
	void calculatePerimeter(double p);

}

class Circle implements Shape{

	@Override
	public void calculateArea(double r) {
		double area;
		area = 3.14*(r*r);
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter(double p) {
		double perimeter;
		perimeter = 2*3.14*p;
		System.out.println(perimeter);
		
	}
	
	
}

class Square implements Shape{

	@Override
	public void calculateArea(double r) {
		double area;
		area = r*r;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter(double p) {
		double perimeter;
		perimeter = 4*p;
		System.out.println(perimeter);
		
		
	}
	

	

	
}
