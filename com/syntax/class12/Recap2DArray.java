package com.syntax.class12;

public class Recap2DArray {
	public static void main(String[] args) {
		String[][] animals = { { "cat", "dog", "bird", "hamster" }, // first array(1st row)
				{ "tiger", "children", "bear" }, // second array(2nd row)
				{ "Salmon", "Shrimp","Sea Bass"}
		};
		int howManyArrays = animals.length; // how many rows
		System.out.println(howManyArrays);

		int a = animals[1].length; // how many columns
		System.out.println(a);

		String b = animals[1][1];
		System.out.println(b);
		
		System.out.println("--------------using for loop------------");

		// how to get all elements from 2d array

		for (int r = 0; r < animals.length; r++) {
			for (int c = 0; c < animals[r].length; c++) {
				String animal = animals [r][c];
				System.out.print(animal + " ");
			}
		System.out.println();
		}
		
		System.out.println("-----------------using enhanced for loop----------------");
	for(String[] array:animals) {
		for (String animal:array) {
			System.out.println(animal);
		}
	}
	
	}

}
