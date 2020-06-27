package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {
		
		// Building an object of the car
		
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of first car is: " + car1.make);
		
		
		System.out.println("-----Accessing methods fromCar class using car1-----");
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		
		
		// Building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of second car is: " + car2.make);
		
		System.out.println("-----Accessing methods fromCar class using car2-----");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		
		
		// new Bus(); complier will give an error
		// because we never created bus class
		
		// create 2 more cars
		Car car3 = new Car();
		car3.make = "Dodge";
		car3.model = "Challenger";
		car3.color = "Black";
		car3.year = 2021;
		car3.speed = 230;
		System.out.println("Make of third car is: " + car3.make);
		
		System.out.println("-----Accessing methods fromCar class using car3-----");
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		
		Car car4 = new Car();
		car4.make = "Nissan";
		car4.model = "GTR";
		car4.color = "White";
		car4.year = 2020;
		car4.speed = 240;
		System.out.println("Make of fourth car is: " + car4.make);
		
		System.out.println("-----Accessing methods from Car class using car3-----");
		car4.drive();
		car4.reverse();
		car4.transportPeople();
	}
	
	
}
