package com.syntax.class10;

public class RecapOdometer {
	public static void main(String[] args) {
		// We bought a new car 
		// It starts with 0000 mileage and it increases
		// It goes 0001, 0002, 0003 ..... 9999
		// Hint: There are 4 inner loops
		
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++){
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++ ) {
						System.out.println(a + "" + b + c + d);
					}
				}
			}
		}
	}

}
