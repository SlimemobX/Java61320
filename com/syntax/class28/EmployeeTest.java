package com.syntax.class28;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setSalary(90000);
		emp.setAge(28);
		emp.setEmpId(829357823);
		
		double salary = emp.getSalary();
		int age = emp.getAge();
		int empID = emp.getEmpId();
		
		System.out.println(salary);
		System.out.println(age);
		System.out.println(empID);
		
		
		
		
	}

}
