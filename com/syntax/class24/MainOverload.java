package com.syntax.class24;

public class MainOverload {

	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		main("main");
		main("main", 3);

	}

	public static void main(String str) {
		System.out.println("I am a main method with 1 parameter");
	}

	public static void main(String str, int num) {
		System.out.println("I am a main method with 2 parameter");

	}

}
