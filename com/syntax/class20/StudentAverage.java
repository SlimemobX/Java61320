package com.syntax.class20;

public class StudentAverage {
	public static void main(String[] args) {
		
		Task2_Average student1 = new Task2_Average("Irwin", 80, 90, 83);
		Task2_Average student2 = new Task2_Average("Alex", 99, 83, 84);
		Task2_Average student3 = new Task2_Average("Kelvin", 98, 73, 65);
		Task2_Average student4 = new Task2_Average("Olvan", 78, 90, 78);
		Task2_Average student5 = new Task2_Average("Josue", 77, 69, 99);
		
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		student5.displayInfo();
	}
}
