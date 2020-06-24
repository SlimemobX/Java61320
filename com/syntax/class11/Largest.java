package com.syntax.class11;

public class Largest {
	public static void main(String[] args) {
		// Find the largest number in array
		int[] numbers = {23, 56, 73, 16, 80, 70, 39};

		// Positives
		int max = 0;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		
		}
		System.out.println(max);
		
		
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
		
		// Negative
		
		int[] nums = {-23, -56, -73, -16, -80, -70, -39};
		int biggest = nums[0];
		for (int num : nums) {
			if (num > biggest) {
				biggest = num;
			}
		
		}
		System.out.println(biggest);
		
		
		
		// This is for 2d arrays
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	int maxed = 0;
	for (int i = 0; i < a.length; i++){
	  for (int j = 0; j < a.length; j++){
	     if (a[i][j] > maxed) {
	    maxed = a[i][j];
	  }
	 
	  }
	}
	System.out.println(maxed);
		
		
		
	}

}
