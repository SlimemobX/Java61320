package com.syntax.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
		// Array is a tray of tea cups
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		// declare and initialize one array of integers
		// Scanner sc = new Scanner
		int[] numbers = new int[4];
		numbers[0] = 10; // index from 0 to 3
		
		numbers [0] = 10;
		numbers [1] = 20;
		numbers [2] = 30;
		numbers [3] = 40;
		// This is wrong ---> numbers [4]
		
		// access elements from the array
		System.out.println(numbers[3]);
		
		// if the array is storing integers 
		// when I get one element I will get one int
		int element0 = numbers[0];
		
		// We are just declaring; not initializing 
		String[] carArray; // preferred way
		String carArray1[]; // works but not preferred
		
		// we are creating/initializing the array
		carArray = new String[3]; // The size is 3 ---> with index 0, 1, 2
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla"; // Will give an exception
		
		String car = carArray[2];
		System.out.println(car);
		
		System.out.println("---------------------");
		char[] letters = new char[4];
		letters[0] = 'A';
		letters[3] = 'B';
		letters[2] = 'G';
		letters[1] = 'Z';
		
		System.out.println("Printing before re-assigning " + letters[2]);
		
		// re-assigning another letter into spot with index
		letters[2] = 'K';
		
		System.out.println("Printing after re-assigning " + letters[2]);
		
		
	}

}
