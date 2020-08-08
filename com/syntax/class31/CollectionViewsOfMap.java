package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {

	public static void main(String[] args) {

		Map<String, Double> grocery = new HashMap<>();

		grocery.put("Apple", null);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 2.99);

		System.out.println(grocery);
		
		double value = grocery.get("Milk");
		System.out.println(value);
		
		// how to get all values
		Collection<Double> values = grocery.values();
		
		System.out.println("------------Get all values 1 by 1 using loop------------");
		
		for(Double v: values) {
			System.out.println(v);
		}
		
		
		System.out.println("------------Get all values 1 by 1 using Iterator------------");
		Iterator<Double> val = values.iterator();
		while(val.hasNext()) {
			Double v =val.next();
			System.out.println(v);
		}
		
		// How to get all the keys?
		Set<String> keys = grocery.keySet();
		
		System.out.println("------------Get all keys 1 by 1 using Iterator------------");
		Iterator<String>  keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			String k =keysIt.next();
			System.out.println(k);
		
		}
		
		System.out.println("------------Get all keys 1 by 1 using loop------------");
		// I want to print key + pair together
		for(String k: keys) {
			System.out.println(k + " and it's value is "+ grocery.get(k));
		}
		
		
		
		
		
		
		

	}

}
