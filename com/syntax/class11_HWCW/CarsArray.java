package com.syntax.class11_HWCW;

public class CarsArray {
	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
			String[] cars = {"American", "German", "Korean", "Italian"};
			for (int s = 0; s < 4; s++) {
				System.out.println(cars[s]);
			}
			System.out.println();
			for (String element : cars) {
				System.out.println(element + " ");
			}
	}

}
