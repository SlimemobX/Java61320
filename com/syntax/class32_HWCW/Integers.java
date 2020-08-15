package com.syntax.class32_HWCW;

import java.util.Collection;
import java.util.LinkedList;

public class Integers {
	
	public static void main(String[] args) {
		
//		Create a collection of integers in which you can keep duplicates. 
//		Write a logic to find sum of all integers
		
		
		Collection<Integer> numbers = new LinkedList<>();
		numbers.add(70);
		numbers.add(80);
		numbers.add(70);
		numbers.add(100);
		numbers.add(70);
		numbers.add(45);
		numbers.add(10);
		
		
		int total = 0;
		for(Integer num : numbers) {
			total += num;
		}
		
		System.out.println(total);
		
	}

}
