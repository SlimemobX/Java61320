package com.syntax.class18_HWCW;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eID = "ID3752485";
		emp1.salary = 125000;
	
		
		Employee emp2 = new Employee();
		emp2.eID = "ID0948569";
		emp2.salary = 145000;
		
	emp1.ID();
	emp2.ID();
	
	
	System.out.println("--------------------------------");
	
	
	System.out.println(Employee.CEO);
	Employee.sayHelloToCEO();
		

	}
	
}
