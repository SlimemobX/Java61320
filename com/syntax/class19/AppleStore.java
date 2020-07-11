package com.syntax.class19;

public class AppleStore {
	
	public static void main(String[] args) {

		// Iphone.touchScreen = false;
		
		Iphone phone1 = new Iphone();
		phone1.model = "11 Pro";
		phone1.memory = 256;
		phone1.price = 1000;
		phone1.color = "Blue";
		
		phone1.displayDetails();
		phone1.displayInfo();
		
		Iphone.touchScreen = false;
		
		System.out.println("--------2nd Phone-------");
		
		Iphone phone2 = new Iphone();
		phone2.model = "11";
		phone2.memory = 64;
		phone2.price = 900;
		phone2.color = "Pink";
		
		phone2.displayDetails();
		phone2.displayInfo();
		
		
		System.out.println("--------Calling info method again--------");
		phone1.displayInfo();
		
	}
}
