package com.syntax.class31_HWCW;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Countries {
	public static void main(String[] args) {
		
		// Create a Set collection in which you need to add names of the countries. 
		// In this set we want all objects to be sorted in alphabetical order. 
		// Using 2 different ways retrieve all elements from set.
		
		
		Set<String> countries = new TreeSet<>();
		countries.add("Canada");
		countries.add("England");
		countries.add("Belgium");
		countries.add("Algeria");
		countries.add("Peru");
		
		System.out.println(countries);
		
		
		Iterator<String> count = countries.iterator();
		while(count.hasNext()) {
			System.out.println(count.next());
			
		}
		
		
		
		
		
	}

}
