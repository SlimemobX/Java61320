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
		
		
		
	}

}
