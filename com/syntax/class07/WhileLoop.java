package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) {
		
		int time = 10;
		
		// This code will execute one time
//		if (time > 12) {
//			System.out.println("Good morning!");
//		}
		
		System.out.println("---------------While Loop---------------");
	
		
		// This code will execute infinitely
		// But then we fixed it by adding time++
		while (time <= 12) {
			System.out.println("Good morning!");
			time++;
		}
		
		// This block of code will not execute
//		while (time > 12) {
//			System.out.println("Good Morning!");
//			time--;
//		}
	
		System.out.println("---------------isRain--------------------");
	
//	initialize the variable
//	while (condition/check the variable){
//		block of code
//	    increment or decrement
//	}
	
		boolean isRain = true;
		
		if (isRain) { 
			System.out.println("Take your umbrella"); //1 time
		}
		
//		while (isRain) {
//			System.out.println("Take your umbrella"); // Infinitely
//		}
		
		System.out.println("---------------while isRain--------------------");
	
		while (isRain) {
			System.out.println("Take your umbrella");
			// isRain++; //compile error
			isRain = false;
		}
	
		System.out.println("---------------------------");
		// how to print numbers 1 to 50?
		
		int x = 1;
		while (x <= 50) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("---------------------------");
		// how to print numbers from 20 to 30?
		int y = 20;
		while (y <= 30) {
			System.out.println(y);
			y++;
		}
		

		System.out.println("---------------------------");
		// how to print numbers from 5 to 15 in the same line?
		
		int z = 5;
		while (z <= 15) {
			System.out.print(z + " ");
			z++;
		}
		
		System.out.println();
		System.out.println("--------------------------");
		// how to print numbers from 10 to 1?
		
		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		
		
		
		
		
		
		
		
	}

}
