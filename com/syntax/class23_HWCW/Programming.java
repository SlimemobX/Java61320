package com.syntax.class23_HWCW;

public class Programming {
//	Create a class named ‘Programming’. 
//	While creating an object of the class, 
//	if nothing is passed to it, then the message “I love programming languages” should be printed. 
//	If some String is passed to it, 
//	then in place of “programming languages” the value variable should be printed. 
//	Example, if we pass “Java”, then “I love Java” should be printed.

	String str;
	
	void displayMessage() {
		System.out.println("I love programming languages");
	}
	
	void displayMessage(String str) {
		this.str = str;
		System.out.println("I love " + str);
	}
	
	
	public static void main(String[] args) {
		Programming msg = new Programming();
		msg.displayMessage();
		msg.displayMessage("Java");
				
	}
	
	






}
