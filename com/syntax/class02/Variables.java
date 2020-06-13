package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		
		// 
		
		String name = "Irwin";
		String lastName = "Ferrufino";
		String grade = "A";
		String city = "Annandale";
		String state = "Virginia";
		String phoneNumber = "571-432-8382";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		// b)
		// change student's city, state, phone number and grade. and print those out
		// not possible 
		// String city = "Garfield"
		
		// Not good, because your not re-assigning
		// String city2 = "Garfield";
		
		System.out.println("-------------");
		
		grade = "A+";
		city = "Miami";
		state = "Florida";
		phoneNumber = "787-582-5402";
				
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		System.out.println("-------------");
		
		// Task:
		// 1. my name is _ and my last name is _.
		// 2. I live in the city of _ state _ and my phone number is _!
		
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println("I live in the City of " + city + ", " + state +  " and my phone number is " + phoneNumber + "!");
		

				
		 
	}

}
