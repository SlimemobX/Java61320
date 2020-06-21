package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		int[] grades = new int[5];

		int size = grades.length;
		System.out.println(size);

		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;

		// What is the average of the class
		// 1st silly way
		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / size;
		System.out.println("The class average is: " + average);
		
		// 2nd best way
		int total = 0;
		for (int k = 0; k < 5; k++) {
			total += grades[k];
		}
		System.out.println("Class average is: " + total / 5);

		System.out.println("----------------------------");

		String[] cities = { "Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "Lorton", "Chicago" };
		// I live in Tampa
		System.out.println("I live in " + cities[2]);

		int i = 1;
		System.out.println("I live in " + cities[i]);

		i += 2;
		System.out.println("I moved in " + cities[i]);

		int cityNumber = cities.length;
		System.out.println("Total number of cities is: " + cityNumber);

		System.out.println("The last city in the list is: " + cities[cityNumber - 1]); // if you don't know number

		// I want to print all the cities
		// cities[0], cities[1], ...... cities[7]
		for (int j = 0; j < 8; j++) {
			System.out.println(cities[j]);
		}

	}

}
