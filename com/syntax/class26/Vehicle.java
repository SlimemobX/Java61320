package com.syntax.class26;

public abstract class Vehicle {
	
	public String vinNumber;
	public static int totalVehicles;
	
	public Vehicle(String vinNumber) {
		this.vinNumber = vinNumber;
		totalVehicles++;
		
	}
	
	public static int getTotal() {
		return totalVehicles;
	}
	
	
	void drive() {
		System.out.println("All Vehicle drives");
	}
	
	void stop() {
		System.out.println("All vehicle stop by pressing break");
	}
	
	public abstract void start();
	
	public abstract void openTrunk();
	
	// can we make abstract method as static? NO
	// public abstract static Hello();
	
	// can we make abstract class as final? NO
	
	// can we make abstract class as private? NO
	
}

abstract class Car extends Vehicle {
	public Car(String vinNumber) {
		super(vinNumber);
	}


	public void openTrunk() {
	System.out.println("All cars can open trunk automatically");
		
	}
}

class Lamborgini extends Car{
	
	public Lamborgini(String vinNumber) {
		super(vinNumber);
	}

	
	public void start() {
		System.out.println("Lamborgini starts magically");
		
	}
	
	
}


