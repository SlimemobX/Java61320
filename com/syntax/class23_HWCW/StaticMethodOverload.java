package com.syntax.class23_HWCW;

public class StaticMethodOverload {
//	Create 1 class with a static method that has 3 overloaded forms. 
//	Then call each overloaded method with specific arguments and observe result.
	
	static void test() {
		System.out.println("non argument constructor");
	}
	
	static void test(String str) {
		System.out.println("Overload with 1 parameters = " + str);
	}
	
	static void test(String str, int a) {
		System.out.println("Overload with 2 parameters = " + str + " " + a);
		
	}
	
	public static void main(String[] args) {
		StaticMethodOverload over = new StaticMethodOverload();
		test();
		test("Syntax");
		test("Batch", 7);
	}
	
	

}
