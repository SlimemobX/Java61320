package com.syntax.class12;

public class InterviewQuestion3FibonacciSequence {
	public static void main(String[] args) {
		System.out.println("--------------Fibonacci sequence------------------");
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series.	
				int n = 10, f1 = 0, f2 = 1;
				System.out.println("First " + n + " terms");
				for (int i = 1; i <= n; i++) {
					System.out.print(f1 + " + ");
				
					int sum  = f1 + f2;
					f1 = f2;
					f2 = sum;
				
				}
				System.out.println();
	}

}
