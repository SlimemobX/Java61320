package com.syntax.class20;

public class ConstructorType {
	ConstructorType(){
		System.out.println("I am a contsructor"); // non argument constructor
	}
	
	ConstructorType(String str){
		System.out.println("I am constructor with 1 parameter " + str); // parameterized constructor
	}
	
	ConstructorType(int num){
		System.out.println("I am constructor with 1 int parameter " + num);
	}
	
	ConstructorType(double num){
		System.out.println("I am constructor with 1 double parameter " + num);
	}
	
	ConstructorType(String name, int age){
		System.out.println("I am constructor with 2 parameter " + name + " " + age);
	}
	
	public static void main(String[] args) {
		
		ConstructorType obj = new ConstructorType("Aidana", 18);
		
		System.out.println("I am a code inside main method");
		
		speak("Hello Class");
	}

	static void speak(String str) {
		System.out.println(str);
	}

}
