package com.syntax.class20;

public class Task2_Average {
	// Write a java program of Class Students that takes students name and 3 subject grades. 
	// Inside your class also have a method to Calculate Average Grade.
	// Test Student class for 5 different students with different marks. 
	// Your program should print an average mark of each students name.

	String name;
	int mathGrade, historyGrade, scienceGrade;
	
	Task2_Average(String studentName, int studentMathGrade, int studentScienceGrade, int studentHistoryGrade) {
		name = studentName;
		mathGrade = studentMathGrade;
		historyGrade = studentHistoryGrade;
		scienceGrade = studentScienceGrade;
		
	}
	
	int average() {
		int ave = (mathGrade + historyGrade + scienceGrade)/3;
		return ave;
	}
	
	void displayInfo() {
		System.out.println(name + "'s avarage grade is " + average());
	}
}
