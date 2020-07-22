package com.syntax.class21_HWCW;

public class Student_Task {

	// Write a Student class that have instance variables name and address. 
	// Create a constructor that will initialize those variables. 
	// Print name & address of given  student using displayInfo method.
	
	String name;
	String address;
	
	Student_Task(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("The students name is " + name + " and they live at " + address);
	}




	
	public static void main(String[] args) {
		Student_Task obj = new Student_Task("Jake","8383 Blackburn rd");
		obj.displayInfo();
	}
}
