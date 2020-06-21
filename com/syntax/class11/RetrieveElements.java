package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {
		
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		// getting all elements
		for (int s = 0; s < 5; s++) {
			System.out.print(grades[s] + ",");
						
		}
		System.out.println();
		
		
		
		System.out.println("---------print using advanced loop--------");
		
		for (char elements : grades) {
			System.out.println(elements + " ");
		}
	System.out.println("-------------------");
	String[] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber"};
	
	for (int j = 0; j < 5; j++) {
		if (fruits[j].equals("Grapes")) {
			System.out.println(fruits[j] + " is my favorite fruit");
		}else {
			System.out.println(fruits[j]);
		}
		
	}
	System.out.println();
	
	for (String element : fruits) {
		System.out.print(element + " ");
	}
	System.out.println();
	for (int j = 0; j < 5; j++) {
		System.out.print(fruits[j] + " ");
	}
	
	}

}
