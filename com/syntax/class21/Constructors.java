package com.syntax.class21;

public class Constructors {
	
	String word;
	
	public Constructors() {
		System.out.println("I am a non argument constructor");
	}
	
	public Constructors(String word) {
		this(12, word); // if need to make a call  ALWAYS must be a 1st statement inside the constructor
		this.word = word;
		System.out.println("I am a parameterized constructor with str = " + word);
	}
	
	public Constructors(int num) {
		System.out.println("I am constructor with 1 parameter = " + num);
	}
	
	public Constructors(int num, String word) {
		System.out.println("I am constructor with 2 parameter = " + num + " and " + word);
	}
	
//	public Constructors(String str) { ---> CE: we cannot have duplicate constructors 
//		System.out.println("I am constructor with 1 parameter = " + num);
//	}
	
	
	public static void main(String[] args) {
		Constructors obj = new Constructors("Java");
		System.out.println(obj.word);
	}

	
	void hello() {
//		this(); --> can only be used in constructor
	}
}
