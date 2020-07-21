package com.syntax.class25;

public class Store {
	
	String name, location;
	
	public Store(String name, String location) {
		this.name=name;
		this.location = location;
	}
	
	public void openHours() {
		System.out.println(name + " is open from 8 am - 8 pm in " + location);
	}
	
	public void sell() {
		System.out.println("Store sales items");
	}
}


class Macys extends Store{
	
	public Macys(String name, String location) {
		super(name,location);
	}
	
	public void openHours() {
		System.out.println(name + " is open from 8 am - 12 am in "+ location);
	}
	
}

class Starbucks extends Store{
	public Starbucks(String name, String location) {
		super(name,location);
	}
	
	public void openHours() {
		System.out.println(name +" is open everyday from 6 am till 8 pm in " + location);
	}
	
	public void sellDrinks() {
		System.out.println(name + " sells different type of drinks");
	}
	
}

class Nike extends Store{
	public Nike(String name, String location) {
		super(name,location);
	}
}
