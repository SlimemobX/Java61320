package com.syntax.class31_HWCW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cities {
	
	public static void main(String[] args) {
		// Create a Set of cities in which you want to make sure that insertion order is maintained. 
		// Using Iterator remove any city that starts with “A”;
		
		Set<String> cities = new HashSet<>(); 
		cities.add("Annandale");
		cities.add("Fairfax");
		cities.add("Falls Church");
		cities.add("Vienna");
		cities.add("Alexandria");
		
		System.out.println(cities);
		
		
		Iterator<String> city = cities.iterator();
		while(city.hasNext()) {
			if (city.next().startsWith("A")) {
				city.remove();
			}
			
			}
		System.out.println(cities);
		
		
	}

	
}
