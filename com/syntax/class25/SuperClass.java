package com.syntax.class25;

public class SuperClass {
	
	protected static void enjoy() {
		System.out.println("I enjoy sundays");
	}

}

class SubClass extends SuperClass{
	
	public static void enjoy() {
		System.out.println("I enjoy everyday");
	}
	
}
