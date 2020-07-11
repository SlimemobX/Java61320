package com.syntax.class19;

public class Iphone {

	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;

	String model;
	int memory;
	double price;
	String color;

	static void displayInfo() { // static works only with static
		System.out.println("iPhone belongs to brand" + brand + " and it's has OS as " + OS
				+ " and all iPhones have touchscreen = " + touchScreen);
	}

//	static void displayDetails() { static methods cannot access instance/non-static members/variables
//		System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color + " color for price = $" + price );
//	}

	void displayDetails() {
		System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color
				+ " color for price = $" + price);
	}

	// can instance method/non-static method access static member

	void displayInfo1() { // instance can work with static and non-static 
		System.out.println("iPhone belongs to brand" + brand + " and it's has OS as " + OS
				+ " and all iPhones have touchscreen = " + touchScreen);

	}

}
