package com.syntax.class10;

public class InClassTask {
	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades = new char [6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[1]);	
		
		char[] grados = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Your grade is " + grados[1]);
			
		// Create an array of names and store all names of your group. 
		// Then print your name from that array. (use 2 different ways of creating an array).
		
		System.out.println("-------------------------------");
		
		String[] names = new String[5];
		names[0] = "Irwin";
		names[1] = "Josue";
		names[2] = "Alex";
		names[3] = "Kelvin";
		names[4] = "Olvan";
		
		System.out.println(names[0]);
		
		String[] nombres = { "Josue", "Kelvin", "Olvan", "Alex", "Irwin" };
		System.out.println(nombres[4]);
		
		
		System.out.println("-----------------------------");
		
		// Create an array of words: Java, Saturday, day, coding, is. 
		// Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[] words = new String[5];
		words[0] ="Java";
		words[1] ="Saturday";
		words[2] ="day";
		words[3] ="coding";
		words[4] ="is";
		
		
		String[] word = { "Java", "Saturday", "day", "coding", "is"};
		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);
	}

}
