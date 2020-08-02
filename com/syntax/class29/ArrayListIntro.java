package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to the arrayList
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		// how many elements inside my ArrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of original list = " + arrayListSize);
		
		// how to access elements from ArrayList
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		
		// I would like to add more objects into ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of list after adding more Stirng objects = " + arrayList.size());
		
		// let's remove "Hello"
		arrayList.remove("Hello");
		
		System.out.println("Size of list after removing a Stirng objects = " + arrayList.size());
		
		
		// I want to update value "Good bye" ---> "Bye"
		arrayList.set(2, "Bye");
		System.out.println(arrayList);
		
		
	}
	
	

}
