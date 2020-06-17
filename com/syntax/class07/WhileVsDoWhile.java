package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {
		// do while vs while
		// 1. do while first executes the code, then checks/test the condition
		// 2. while first checks/tests the condition, then executes the code
	
	
		// print hello 5 times
		// while checks soup is hot, before eating
		// do while check if soup is hot, after eating
		// with do while loop you will get burn!!!!
		
		int x = 11;
		while (x <= 3) { // check before going into the loop
			System.out.println("Hello!");
			x++;
			
		}
	
	
	
		System.out.println("----------Using Do While loop-------------");
		
		int y = 11;
		
		do {
			System.out.println("Hello!");
			y++;
		}while (y <= 3); // checks after going into the loop
	
	
	
	
	
	
	
	
	}

}
