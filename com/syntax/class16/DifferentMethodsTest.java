package com.syntax.class16;

public class DifferentMethodsTest {
	public static void main(String[] args) {
		DifferentMethods obj = new DifferentMethods(); 
		// call method sayHello
		obj.sayHello(2);
		
		System.out.println("----------");
		obj.sayHello(5);
		
		System.out.println("----------");
		
		// call method printAnyWord
		obj.printAnyWord("I Love You", 3);
		
		System.out.println("----------");
		
		obj.printAnyWord("Bye", 5);
		
		System.out.println("----------");
		// call method isHungry
		obj.isHungry(false);
		
	}

}
