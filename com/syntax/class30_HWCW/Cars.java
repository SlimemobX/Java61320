package com.syntax.class30_HWCW;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {

	public static void main(String[] args) {
		
	// Create an arraylist of cars and retrieve all the values using 3 different ways.	
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Ford");
		cars.add("Dodge");
		cars.add("Nissan");
		cars.add("Ferarri");
		cars.add("Lamborghini");
		cars.add("Koenigsegg");
		
		System.out.println(cars);
		
		
		System.out.println("--------First way-------");
		for (String car: cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		
		
		System.out.println("--------second way-------");
		
		for (int i = 0; i < cars.size(); i++) {
			String c = cars.get(i);
			System.out.print(c + " ");
		}
		System.out.println();
		
		
		
		System.out.println("--------Third way-------");
		
		Iterator<String> carsIt = cars.iterator();
		
		while(carsIt.hasNext()) {
			String ca = carsIt.next();
			System.out.print(ca + " ");
		}
		
	}

}
