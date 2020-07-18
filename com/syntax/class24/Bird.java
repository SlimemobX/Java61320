package com.syntax.class24;

public class Bird {
	
	public void fly() {
		System.out.println("Bird is flying");
	}
	
	public void eat() {
		System.out.println("Bird is eating");
	}
	
	public void sleep() {
		System.out.println("Bird is sleeping");
	}

}

class BabyBird extends Bird{
	
	public void fly() {
		System.out.println("Baby bird can fly after few month");
	}
	
	public void eat() {
		System.out.println("Baby bird needs help eating");
	}
	
	public void cry() {
		System.out.println("Baby bird is crying");
	}
}
