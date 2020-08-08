package com.syntax.class30_HWCW;

import java.util.ArrayList;

public class Drinks {
	
	public static void main(String[] args) {
		
	
	// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
	
	ArrayList<String> drinks = new ArrayList<>();
	
	drinks.add("Tea");
	drinks.add("Monster");
	drinks.add("Kiwi");
	drinks.add("Soda");
	drinks.add("Liqour");
	drinks.add("Hot Coco");
	
	System.out.println(drinks);
	
	for(int i = 0; i < drinks.size(); i++) {
		if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
			drinks.set(i, "water");
		}
	}
	System.out.println(drinks);
	
	







	}
}
