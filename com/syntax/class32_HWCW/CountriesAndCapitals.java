package com.syntax.class32_HWCW;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountriesAndCapitals {
	
	public static void main(String[] args) {
		
		
		// Create a map of countries with its capital that will store countries in alphabetical order.
		// Print all keys and values from a country map using for each loop and iterator.
		// Print all values from a country map using for each loop and iterator.
		
		
		Map<String, String> geography = new TreeMap<>();
		geography.put("Spain", "Madrid");
		geography.put("France", "Paris");
		geography.put("Germany", "Berlin");
		geography.put("Brazil", "Brasilia");
		geography.put("United States", "Washington, D.C");
		geography.put("Australia", "Canberra");
		
		
		Set<String> keys = geography.keySet();
		
		System.out.println("------------Getting all keys and values using Iterator------------");
		Iterator<String>  keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			String k =keysIt.next();
			System.out.println(k + " it's capital is "+ geography.get(k));
		
		}
		
		System.out.println("------------Getting all keys and values using loop------------");
		// I want to print key + pair together
		for(String key: keys) {
			System.out.println(key + " it's capital is "+ geography.get(key));
			
		}
		
		
		
	Collection<String> values = geography.values();
		
		System.out.println("------------Get all values using loop------------");
		
		for(String v: values) {
			System.out.println(v);
		}
		
		
		System.out.println("------------Get all values using Iterator------------");
		Iterator<String> val = values.iterator();
		while(val.hasNext()) {
			String v =val.next();
			System.out.println(v);
		}
		
		
		
		
		
	}

}
