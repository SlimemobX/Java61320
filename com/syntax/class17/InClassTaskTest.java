package com.syntax.class17;

public class InClassTaskTest {
	public static void main(String[] args) {
		InClassTask t = new  InClassTask();
		String email = t.createmail("Irwin", "Ferrufino", "Yahoo");
		System.out.println(email);
		
		
		boolean prime = t.isPrime(2);
		System.out.println(prime);
		
		Student s = new Student();
		char grade = s.grade(75);
		System.out.println("The value of grade = " + grade);
		
	}
}
