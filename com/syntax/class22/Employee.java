package com.syntax.class22;

public class Employee {
	public static String company; // entire project
	protected String fullName; // same project unless inherited
	double salary; // same package
	private long ssn; // same class

	
	
	void work() {
		System.out.println("Works for " + company);
	}
	
	void getPaid() {
		System.out.println("Salary is $" + salary);
	}

}
