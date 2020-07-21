package com.syntax.class25_HWCW;

public class Computer {
//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods.

	
	String name, internet;
	
	public Computer(String name, String internet) {
		this.name = name;
		this.internet = internet;
	}
	
	public void work() {
		System.out.println(name + " computer let's you do your work and save");
	}
	
	public void internet() {
		System.out.println(name + " computer you can access " + internet);
	}
	
	
	
}

class Apple extends Computer{
	public Apple(String name, String internet) {
		super(name,internet);
	}
	
	public void internet() {
		System.out.println(name + " computer you can access " + internet);
	}
	
	public void logo() {
		System.out.println("Their logo is an apple");
	}
}

class Lenovo extends Computer{
	public Lenovo(String name, String internet) {
		super(name,internet);
	}
	
	public void internet() {
		System.out.println(name + " computer you can access " + internet);
	}
}

class HP extends Computer{
	public HP(String name, String internet) {
		super(name,internet);
	}
	
	public void internet() {
		System.out.println(name + " computer you can access " + internet);
	}
}

class Dell extends Computer{
	public Dell(String name, String internet) {
		super(name,internet);
	}
	
	public void internet() {
		System.out.println(name + " computer you can access " + internet);
	}
}
