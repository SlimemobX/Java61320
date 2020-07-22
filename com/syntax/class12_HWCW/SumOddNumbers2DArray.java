package com.syntax.class12_HWCW;

public class SumOddNumbers2DArray {
	public static void main(String[] args) {
	
	// lets create a 2D array of int and calculate sum of all odd numbers
	int[][] numbers = {
			{10,23,56,47},
			{33,668,89},
			{1,9,0}
			
	};
	// Regular for loop
	int sum =0;
	for (int i = 0; i<numbers.length;i++) {
		for (int j = 0; j < numbers[i].length; j++) {
			int element = numbers[i][j];
			if (element % 2 != 0) {
				sum += element;
			}
			
		}
	System.out.println(sum);
	}
	
	
	
	}

}
