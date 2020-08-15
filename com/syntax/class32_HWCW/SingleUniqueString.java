package com.syntax.class32_HWCW;

import java.util.Collection;
import java.util.LinkedHashSet;

public class SingleUniqueString {
	
	public static void main(String[] args) {
		
//		Create the collection that will store single unique Objects of a String type in which order is preserved.
//		Write a logic to concatenate all string from the collection.
		
		Collection<String> obj = new LinkedHashSet<>();
		obj.add("Blue");
		obj.add("Black");
		obj.add("Red");
		obj.add("Green");
		obj.add("White");
		obj.add("Pink");
		
		String colors = "";
		for(String color :obj) {
			colors += color + " ";
		}
		
		System.out.println(colors);
		
	}

}
