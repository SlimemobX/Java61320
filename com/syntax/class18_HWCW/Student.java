package com.syntax.class18_HWCW;

public class Student {
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	String studentID;
	
	static int numberOfStudents = 120;
	int numbers = 0;
	
	Student(){
		numberOfStudents++;
		numbers = numbers + 1;
	}
	
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "Jake";
		student1.studentID = "A4958354";
		
		
		Student student2 = new Student();
		student2.studentName = "Jane";
		student2.studentID = "A2397823";
		
		Student student3 = new Student();
		student3.studentName = "Erin";
		student3.studentID = "A9384834";
		
		System.out.println("There is a total of " + Student.numberOfStudents + " students.");
		
		
	}

	
}
