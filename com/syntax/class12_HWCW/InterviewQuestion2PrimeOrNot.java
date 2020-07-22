package com.syntax.class12_HWCW;

import java.util.Scanner;

public class InterviewQuestion2PrimeOrNot {
	public static void main(String[] args) {
		System.out.println("----------------Prime or not------------------------");
		
	// Write a java program to check whether a given number is prime or not?
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number");
			int num = scan.nextInt();
			
			boolean prime = true;
			for (int c = 2; c <= num/2; c++) {
				if (num % c == 0) {
					prime = false;
					break;
				}
			}
//			System.out.println(prime);
			if (prime) {
				System.out.println("It is a Prime number");
			}else {
				System.out.println("It is not a prime number");
			}
	
	
	
	System.out.println("--------------Teacher did it---------------");
	
	int number =31;
	boolean prime2 = true;
	if (number > 1) { // i will check
		for (int i =2; i < number; i++) {
			if (number % i == 0) { // number id divisible by 1
				prime2 =false;
				break;
			}
		}
	}else {
		prime2 = false;
	}
	System.out.println("The number " + number + " is prime: " + prime2 );
	
	System.out.println("==================improved way================");
	// this was correct
	// can we improve it
	// 1st improvement, try to divide it until number/2
	// 2nd improvement, try to divide it until number/1
	int numbers = 17;
	boolean prime3 = true;
	if (numbers > 1) {
		for (int j = 2; j <= numbers / j; j++) {
			System.out.println("try to divide by " + j);
			if (numbers % j == 0) {
				prime3 = false;
				break;
			}
		}
	}else {
		prime3 = false;
	}
	System.out.println("The number " + numbers + " is prime: " + prime3 );
	
	
	
	}

}
