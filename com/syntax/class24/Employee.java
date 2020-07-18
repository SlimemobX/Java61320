package com.syntax.class24;

public class Employee {
	
	double salary;
	
	void getPaid() { //over ridden method
		System.out.println("Employee gets paid = "+ salary);
	}

	
}

class FullTimeEmployee extends Employee{

}











class PartTimeEmployee extends Employee{
	
}











class Contractor extends Employee{
	
	double hourlyRate;
	
	void getPaid() { // overriding method
		System.out.println("Contractor gets paid hourly rate = " + hourlyRate);
	}
}	
