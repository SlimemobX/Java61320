package com.syntax.class10;

public class TrianglePattern {
	public static void main(String[] args) {
		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// let us add 2nd triangle
		// ****
		// ***
		// **
		// *
		
		for (int i = 4; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		
			
		System.out.println();
		}
	}

}
