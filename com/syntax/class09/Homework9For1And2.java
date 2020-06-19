package com.syntax.class09;

public class Homework9For1And2 {
	public static void main(String[] args) {
		//Print the following pattern:
		//54321
		//54321
		//54321
		//54321
		for (int a = 4; a >= 1; a--) {
			for (int b = 5; b >= 1; b--) {
				System.out.print(b);
			}
		System.out.println();
		}
		
		System.out.println("------------------------------");
		//Print the following pattern:
		//55555 
		//44444
		//33333
		//22222
		//11111
		
		for(int c = 5; c >= 1; c--) {
			for (int d = 5; d >= 1; d--) {
				System.out.print(c);
			}
		System.out.println();
		}
	}

}
