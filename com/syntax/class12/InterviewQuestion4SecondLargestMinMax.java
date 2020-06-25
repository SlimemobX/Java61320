package com.syntax.class12;

import java.util.Arrays;

public class InterviewQuestion4SecondLargestMinMax {
	public static void main(String[] args) {
		System.out.println("---------------Second largest & MaxANDMin---------------");
		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?
		int[] arr = { -9, 20, 12, -56, 98, 320, 7, 10, 435, 340 };
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.println();

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > largest) {
				secondLargest = largest;
				largest = arr[x];
			} else if (arr[x] > secondLargest) {
				secondLargest = arr[x];
			}
		}

		System.out.println(secondLargest);

		int max = 0;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}

		}
		System.out.println("The maximum number is: " + max);

		int min = 0;
		for (int num1 : arr) {
			if (num1 < min) {
				min = num1;
			}
		}
		System.out.println("The minimum number is: " + min);

		System.out.println("---------------teacher way--------------------");

		int[] numbers = { 32, 61, 16, 89, 74, 25 };

		int max1 = numbers[0];
		int min1 = numbers[0];
		for (int num : numbers) {
			if (num > max1) {
				max1 = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Maximun is: " + max1);
		System.out.println("Minimum is: " + min1);
		
		// 2nd way
		System.out.println("-------sorting---------");
		Arrays.sort(numbers);
		
			
			System.out.println("Maximum is: " + numbers[numbers.length - 1]);// the last element
			System.out.println("The second largest: " + numbers[numbers.length - 2]);
			System.out.println("Minimum is: " + numbers[0]); // first element
		
	}

}
