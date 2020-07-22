package com.syntax.class26;

public class PhoneTest {
	public static void main(String[] args) {
		
	// new Phone(); CE: cannot create an object of Abstract class
		
		Phone iPhone = new IPhone();
		iPhone.makeCall();
		iPhone.sendText();
		iPhone.navigate();
		iPhone.playMusic();
		
		System.out.println();
		

		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();
	}

}
