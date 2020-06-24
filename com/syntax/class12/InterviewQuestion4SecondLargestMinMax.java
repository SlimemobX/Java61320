package com.syntax.class12;

public class InterviewQuestion4SecondLargestMinMax {
	public static void main(String[] args) {
		System.out.println("---------------Second largest & MaxANDMin---------------");
		  // Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
					int [] arr = {-9,20,12,-56,98,320,7,10,435,340};
					int largest = arr[0];
					int secondLargest = arr[0];
					
					for (int x = 0; x < arr.length; x++) {
						System.out.print(arr[x] + " ");
					}
					System.out.println();
					
					for (int x =0; x< arr.length; x++) {
						if (arr[x] > largest) {
							secondLargest = largest;
							largest = arr[x];
						}else if (arr[x] > secondLargest) {
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
	}

}
