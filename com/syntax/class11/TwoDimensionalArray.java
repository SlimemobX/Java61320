package com.syntax.class11;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] numbers = new int[3][4]; // [rows][cols]
		// 1st row with index 0
		numbers [0][0] = 10;
		numbers [0][1] = 15;
		numbers [0][2] = 20;
		numbers [0][3] = 25; 
		
		// 2nd row row with index 1
		numbers [1][0] = 32;
		numbers [1][1] = 36;
		numbers [1][2] = 40;
		numbers [1][3] = 44;
		
		// 3rd row with index 3
		numbers [2][0] = 63;
		numbers [2][1] = 66;
		numbers [2][2] = 69;
		numbers [2][3] = 472;
		
		// print number 20
		System.out.println(numbers[0][2]);
		
		
		
		// If we know the values upfront
		int[][] nums = {
				{10,15,20,25},
				{32,36,40,44},
				{63,66,69,72},				
		};
	System.out.println(numbers[2][0]);
	System.out.println(numbers[1][3]);
	}

}
