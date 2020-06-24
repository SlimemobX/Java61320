package com.syntax.class11;

public class InClassWork2 {
	public static void main(String[] args) {
		// Create a 2D array where you will store the following values:
		// Mr, Mrs, Ms, Miss and Smith, Obama, Jackson, Jordan
		// After storing values print the following Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		String[][] names = new String[2][4];
		names [0][0] = "Mr";
		names [0][1] = "Mrs";
		names [0][2] = "Ms";
		names [0][3] = "Miss"; 
		
		// 2nd row row with index 1
		names [1][0] = "Smith";
		names [1][1] = "Obama";
		names [1][2] = "Jackson";
		names [1][3] = "Jordan";
		
		System.out.println(names[0][1] + " " +names[1][0]);
		System.out.println(names[0][0] + " " +names[1][1]);
		System.out.println(names[0][2] + " " +names[1][2]);
		System.out.println(names[0][3] + " " +names[1][3]);
				
		
		
		// Create a 2D array that first row will contain 4 names 
		// and second row will contain grades
		// then you program should print name of student and that has A and B grade
		
		
		
	}

}
