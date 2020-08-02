package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	
	public static void main(String[] args) {
		// create an array of city names
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("DC");
		cities.add("Instanbul");
		
		
		
		System.out.println(cities);
		
		// remove LA,DC
		
		System.out.println("-------- Removing objects from ArrayList using for Loop-------");
		for (int i = 0; i < cities.size(); i++) {
			if(cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
				System.out.println(cities);
			}
		}
		System.out.println("final arratlist ==== " + cities);
		
		
		System.out.println("-------- Removing objects from ArrayList using advanced for Loop-------");
//		for (String city: cities) {
//			if (city.equals("New York")) {
//				cities.remove(city);
//				
//			}
//		}
//		
		System.out.println(cities);
		
		
		System.out.println("-------- Removing objects from ArrayList using Iterator-------");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");
		
		System.out.println("------------- Collection before using Iterator " + cities);
		
		Iterator<String> citiesIt = cities.iterator();
		// lets remove New York and LA
		while(citiesIt.hasNext()) {
			String ci = citiesIt.next();
			if (ci.equals("LA") || ci.equals("New York")) {
				citiesIt.remove();
			}
		}
		System.out.println("ArrayList after modifications from Iterator: " + cities);
		
		
		
		
	}

}
