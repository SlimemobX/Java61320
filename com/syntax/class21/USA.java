package com.syntax.class21;

public class USA {
	public static String country;
	String state;
	String capital;
	
	USA(String state, String capital){
		this.state= state;
		this.capital =capital;
	}
	
	void displayState() {
		System.out.println("State is " + state);
	}
	
	void displayCapital() {
		System.out.println("Capital is " + capital);
	}
	
	void displayInfo() {
		displayState();
		displayCapital();
	}
}
