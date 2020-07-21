package com.syntax.class24_HWCW;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.study();
		s.exams();
		
		
		System.out.println("---------Syntax Student--------");
		SyntaxStudent ss = new SyntaxStudent();
		ss.IT();
		ss.study();
		ss.exams();
		
		System.out.println("---------College Student--------");
		CollegeStudent cs = new CollegeStudent();
		cs.schedule();
		cs.study();
		cs.exams();
		
		
		System.out.println("---------School Student--------");
		SchoolStudent ss2 = new SchoolStudent();
		ss2.sleepy();
		ss2.study();
		ss2.exams();
		
		
		System.out.println("-----------------------Homework Review-------------------");
		
		
		System.out.println("--------- Creating an object of college student but give reference to Student class------------");
		Student obj = new CollegeStudent();
		obj.study();
		obj.exams();
		
		System.out.println("---------- Creating an object of syntax student but give reference to Student class------------");
		Student obj2 = new SyntaxStudent();
		ss.study(); // runtime polymorphism
		ss.exams(); // runtime polymorphism
		
		
		System.out.println("---------- Creating an object of school student but give reference to Human class------------");
		Human obj3=new SchoolStudent();
 		obj3.happy();
 		obj3.study();//runtime polymorphism
	}

}
