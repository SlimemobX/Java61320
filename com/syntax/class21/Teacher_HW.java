package com.syntax.class21;

public class Teacher_HW {

	// Write a Java program called Teacher.  
	// Identify features and behaviour of that Class. 
	// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. 
	// Test all 4 classes 

	String name, lastName;
	int experience;
	boolean enjoy;
	
	void teaches() {
		System.out.println("Teaches kids becasue they love doing it and putting knowledge in their head");
		
	}
	
	void support() {
		System.out.println("Always support their students");
	}
	
	void diplayInfo() {
		System.out.println("Teachers name is " + name + " "
	                       + lastName + " and has " + experience 
	                       + " years of experience and enjoys teaching = " + enjoy);
		
		}




}
