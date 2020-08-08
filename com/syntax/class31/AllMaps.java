package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	public static void main(String[] args) {
		
		// create a map of grocery that will hold item: price
		System.out.println("-------HashMap---------");
		Map<String,Double> grocery = new HashMap<>();
		
		grocery.put("Apple", null);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 2.99);
		
		System.out.println(grocery);
		
		System.out.println("-------LinkedHashMap---------");
		// LinkedHashMap preserve insertion order of keys
		Map<String, Double> mall = new LinkedHashMap<>();
		mall.put("Cologne", 99.99);
		mall.put("T-Shirt", 15.99);
		mall.put("Shoes", 99.99);
		mall.put("Soap", 1.99);
		mall.put("Cologne", 99.99);
		mall.put("Tea", 3.99);
		
		System.out.println(mall);
		
		System.out.println("-------TreeMap---------");
		Map<String, Double> shoppingList = new TreeMap<>();
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		shoppingList.put("Computer", null);
		// shoppingList.put("null", 10.99); cannot not have null Keys
		
		System.out.println(shoppingList);
		
		System.out.println("-------Hashtable---------");
		Map<String, Double> htable = new Hashtable<>();
		htable.put("House", 600000.00);
		htable.put("Car", 60000.00);
		htable.put("Food", 100.00);
		htable.put("Cup", 10.00);
		//htable.put(null,1.99); // Hashtable does not allow Key null 
		//htable.put(null,null); // Hashtable does not allow null value
		
		System.out.println(htable);
		
		System.out.println();
		// adding null keys and null values to the HashMap
		grocery.put(null, 0.99); // HashMap can have at least 1 null key
		grocery.put(null,null); // HashMap can have multiple null values
		
		System.out.println(grocery);
		
		// adding null keys and null values to the LinkedHashMap
		mall.put(null, 0.99);
		mall.put(null,null);
		mall.put("Water", null);
		
		System.out.println(mall);
		
		
		
		
	}

}
