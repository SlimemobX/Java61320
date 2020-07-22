package com.syntax.class18_HWCW;

public class Student1 {
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	String studentID;
	
	static int numberOfStudents = 120;
	
	void display() {
		System.out.println("The students name is " + studentName + " and ID is: " + studentID);
	}
	
	
	public static void main(String[] args) {
		Student1 student1 = new Student1();
		student1.studentName = "Jake";
		student1.studentID = "A4958354";
		student1.display();
		numberOfStudents++;
		
		Student1 student2 = new Student1();
		student2.studentName = "Jane";
		student2.studentID = "A2397823";
		student2.display();
		numberOfStudents++;
		
		Student1 student3 = new Student1();
		student3.studentName = "Erin";
		student3.studentID = "A9384834";
		student3.display();
		numberOfStudents++;
		
		System.out.println("There is a total of " + Student.numberOfStudents + " students.");
		
		
	}
}
