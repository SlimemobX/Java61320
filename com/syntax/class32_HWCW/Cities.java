package com.syntax.class32_HWCW;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cities {
	
	public static void main(String[] args) {
		
//		Create a Map from array of cities that will sort keys in alphabetical order. 
//		As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//		If any city name is more than 7 characters remove that city . 
		
		Map<String, Integer> cities = new TreeMap<>();
		
		cities.put("Washington DC", 13);
		cities.put("Paris", 5);
		cities.put("Rome", 4);
		cities.put("Tegucigalpa", 11);
		cities.put("Manchester", 10);
		cities.put("Madrid", 6);
		cities.put("Seoul", 5);
		
		System.out.println(cities);
		
		Set<String> keys = cities.keySet();
		Iterator<String> city = keys.iterator();
		
		while(city.hasNext()) {
			String it = city.next();
			if(it.length() > 7) {
				city.remove();
			}
		}
		
		System.out.println("Cities with less than 7 characters: " + cities);
		
		
		
	}

}
