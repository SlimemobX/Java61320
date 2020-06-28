package com.syntax.class15;

public class InClassTask {
	public static void main(String[] args) {
		// Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.
		
		String ab = "How are you this afternoon?";
		ab = ab.replaceAll(" ","");
		System.out.println(ab);


		// Create a String that should be combination of letters, numbers and special characters. 
		// Find out how many alpha characters are there in the String.
		
		String b = "Hello 328574875 friend $#%&&";
		b =b.replaceAll("[^A-za-z]", "");
		int length = b.length();
		System.out.println(length);
		



		// You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
		// How would you find out how many sentences are in that String?
	
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("[?]");
		int sentence = array.length;
		System.out.println("The total number of sentences are: " + sentence);
			
	
	}


}
