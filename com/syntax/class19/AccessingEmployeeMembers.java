package com.syntax.class19;

public class AccessingEmployeeMembers {
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.name = "Godze";
		emp.lastName = "Doe";
		emp.age = 30; // protected
		emp.salary = 100000; // default
		// emp.ssn ----> won't be available because it is private
		
		emp.dispalyName();
		emp.displayAge();
		emp.displaySalary();
		// emp.displaySsn(); won't be available because it is private
		
		
	}

}
