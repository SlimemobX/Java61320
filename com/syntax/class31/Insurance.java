package com.syntax.class31;

public abstract class Insurance {


	String insuranceName;
	Insurance(String insuranceName){
		this.insuranceName= insuranceName;
	}
	
	public abstract void getQuote();
	
	public abstract void cancelInsurance();

}

class Car extends Insurance{
	String carModel;

	Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel= carModel;
		
	}

	@Override
	public void getQuote() {
		System.out.println("Get the qoute for " + carModel + " from " + insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the insurance for " + carModel + " from " + insuranceName);
		
	}
	
}

class Pet extends Insurance{
	String petType;

	Pet(String petType, String insuranceName) {
		super(insuranceName);
		this.petType = petType;
		
	}

	@Override
	public void getQuote() {
		System.out.println("Get the qoute for " + petType + " from " + insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the insurance for " + petType + " from " + insuranceName);
		
	}
	
}

class Health extends Insurance{

	Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("Get the qoute from " + insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the insurance for from " + insuranceName);
		
	}
}
