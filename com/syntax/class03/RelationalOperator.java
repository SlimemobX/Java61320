package com.syntax.class03;

public class RelationalOperator {
	
	public static void main(String[] args) {
		// > = greater than
		// < = less than
		
		int a = 7;
		int b = 10;
	
		System.out.println(3 > 4); // false
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // false
		
		System.out.println("----------------------");
		
		double i = 10.78;
		double j = 10.78;
		
		boolean result1 = i > j; // is i greater than j?
		System.out.println(result1);
		
		boolean result2 = i == j; // is i equal to j
		System.out.println(result2);
		
		boolean result3 = i != j; // is i different?
		System.out.println(result3);
		
		boolean result4 = i >= j; // is i greater or equal to j?
		System.out.println(result4);
		
		boolean result5 = i <= j;
		System.out.println(result5);
	}

}
