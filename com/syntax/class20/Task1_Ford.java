package com.syntax.class20;

public class Task1_Ford {
	// Write a program that will have a constructor:
	// one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors 1 by 1.
	
	
	public static String make = "Ford";
	protected String model;
	int year;
	
	
	public void displayInfo() {
		System.out.println("We have a " + year +" "+ make+ " "+ model + " for sale");
	}
	
	Task1_Ford(){
		System.out.println("CAR FOR SALE");
	}
	
	Task1_Ford(String carModel, int carYear){
		model = carModel;
		year = carYear;
				
	}
	
	
}
