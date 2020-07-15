package com.syntax.class22;

public class Car {
	String make;

	public Car(String make) {
		// super();
		this.make = make;
	}

}

class Tesla extends Car {

	boolean autopilot;

	public Tesla(String make, boolean autopilot) {
	    super(make);
		this.autopilot= autopilot;
	}

	void info() {
		
		System.out.println("We build " + make + " that has aotupilot feature = "+ autopilot);

	}
}
