package com.syntax.class02;

public class ArithmeticOperationDemo {

	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 5;
		
		int num3 = num1;
		System.out.println(num3);
		
		
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println("addition --> " + sum);
	
		
		int sub = num1 - num2;
		System.out.println(sub);
		System.out.println("subtraction --> " + sub);		
		
				
		int mult = num1 * num2;
		System.out.println(mult);
		System.out.println("multiplication --> " + mult);
		
		int div = num1 / num2;
		System.out.println(div);
		System.out.println("division --> " + div);
		
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dsum = d1 + d2;
		System.out.println("Double addition --> " + dsum);
		
		// you can store an integer as double
		double dsum2 = num1 + num2;
		System.out.println("dsum2 -->" + dsum2);
		
		System.out.println("*******************");
		// Order of operation
		System.out.println("addition --> " + num1 + num2);
		System.out.println("Ahmet_" + 10 + 30);
		// first Parenthesis, then concatenation
		System.out.println("Ahmet_" + (10 + 30));
		// first multiplication, then concatenation
		System.out.println("Ahmet_" + 10 * 30);
		
		// Arithmetic Operation
		// PEMDAS: 
		// 1. parenthesis
		// 2. multiplication/division
		// 3. addition/subtraction
		
		
	
	}
}
