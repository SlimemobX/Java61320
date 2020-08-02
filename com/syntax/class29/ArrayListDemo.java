package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// let's create an Arraylist that will store numbers
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		
		System.out.println("Size of alist: " + alist.size());
		System.out.println(alist);
		
		alist.add(1);
		alist.add(2);
		
		System.out.println(alist);
		
		alist.remove(2);
		System.out.println(alist);
		
	}

}
