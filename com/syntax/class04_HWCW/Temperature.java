package com.syntax.class04_HWCW;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		//Create a Java program that will ask user to input city and temperature.
				//Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"
				
				Scanner weather = new Scanner(System.in);
				System.out.println("What city do you live in?");
				String city = weather.nextLine();
				System.out.println("What's the temperature in you city?");
				double fah = weather.nextDouble();
				double cel = (fah - 32) * 5/9;
				System.out.println("The temperature in the city of " + city + " is " + cel );
	}

}
