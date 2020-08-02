package com.syntax.class29_HWCW;

import java.util.ArrayList;

public class ArrayName {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Jake");//0
		names.add("Alex");//1
		names.add("Jane");//2
		names.add("Clarke");//3
		names.add("Bailey");//4
		
		System.out.println("The size of names is: " + names.size());
		System.out.println(names);
		
		Boolean name = names.isEmpty();
		System.out.println(name);
		
		Boolean name2 =names.contains("Clarke");
		System.out.println(name2);
		
		
		
//		if (names.isEmpty()) {
//			System.out.println("It is empty");
//		}else {
//			System.out.println("Not empty");
//		}
//		if (names.contains("Bailey")) {
//			System.out.println("name is there");
//		}else {
//			System.out.println("name is not part of list");
//		}
		
		
		
		
	}
}
