package com.syntax.class19_HWCW;

public class InClassTask19 {
	
	// System.out.println("------sum of an array-------");
	//Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class.
	

	protected int arr(int[] array) {
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			sum += array[a];
		}
	return sum;
	
	}
	
	
	
//	System.out.println("----------String reverse-------------");
	
	// Create a method that will take a String as a parameter and returns reversed String. 
	// Method should be available to all classes within your project and accessible by class name.
	
	public static String words(String word) {
		String reverse = "";
		for (int w = word.length() - 1; w >= 0; w--) {
			reverse += word.charAt(w);
		}
	return reverse;
	}






}
