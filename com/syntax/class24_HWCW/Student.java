package com.syntax.class24_HWCW;


class Human{
	public void happy() {
 		System.out.println("Humans are happy");
 	}

 	public void study() {
 		System.out.println("Humans should study");
 	}
}

public class Student extends Human{
//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism

public void study() {
	System.out.println("All student need to study");
}

public void exams() {
	System.out.println("All student shave to take exams");
}
	
}
