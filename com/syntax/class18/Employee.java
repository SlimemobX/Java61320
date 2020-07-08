package com.syntax.class18;

public class Employee {
	
	//  Create a Class called Employee:
	//	Create three  variables  eID , salary and set the CEO to “Sumair” 
	//	Create two objects of the class Employee 
	//	Set the value of eID, salary for each of the objects
	//	Print out the eID , salary and  CEO for each of the objects
	
	
	String eID;
	int salary;
	
	static String CEO = "Sumair";
	
	void ID() {
		System.out.println("Employee ID is: " + eID + " Salary is: " + salary + " and CEO is " + CEO);
	}

		
	public static void main(String[] args) {
		System.out.println(Employee.CEO);
		
		// accessing static variables within same class
		System.out.println(CEO);
		
		// accessing static method
		sayHelloToCEO();
	}

	static void sayHelloToCEO() {
		System.out.println("Hi " + CEO);
	}
	
}
