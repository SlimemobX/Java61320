package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {

		LinkedList<String> food= new LinkedList<>();
		
		food.add("beshparmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");
		
		String myfood = food.get(2);
		System.out.println(myfood);
		
		
		
		
		LinkedList<String> deserts= new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");
		
		food.addAll(deserts);
		
		System.out.println("LinkedList after adding another collection = " + food);
		
		
		food.remove("biryani");
		System.out.println("LinkedList after removing element = " + food);
		
		food.set(3,"brownie" );
		System.out.println("LinkedList after replacing element = " + food);
		
		
		// I want to get all value 1 by 1
		
		Iterator<String> foodIt = food.iterator();
		while(foodIt.hasNext()) {
			String foods = foodIt.next();
			System.out.print(foods + " ");
			if (foods.equals("cookies") || foods.equals("brownie")) {
				foodIt.remove();
			}
		}
		
		
		System.out.println();
		System.out.println("LinkedList after iterator = " + food);
		
		
		// lets create a linkedList with Country type of objects
		
		LinkedList<Country> countries= new LinkedList<>();
		countries.add(new USA("USA"));// 0
		countries.add(new Kazakhstan("Kazakhstan"));// 1
		countries.add(new Afghanistan("Afghanistan"));// 2
		
		System.out.println("Collection of Country objects has " + countries.size() + " elements");
		
		for (Country c : countries) {
			c.election();
		} 
		
	}

}
