package com.syntax.class27;

public class MotorcycleTest {
	public static void main(String[] args) {
		
		// new Drivable(); CE: cannot instantiate
		
		
		// new Motorcycle(); CE: cannot instantiate
		
		
		System.out.println("-----------Object of Motorcycle Type-----------");
		Motorcycle m = new Bike();
		m.driving();
		m.breaking();
		m.operateVehicle();
		
		
		// motorcycle.DRIVE = "not safe"; CE cannot change value of final variable
		System.out.println(Motorcycle.DRIVE); // static variable accessible through class name
		
		
		System.out.println("-----------Object of Drivable Type-----------");
		
		Drivable d = new Bike();
		d.driving();
		d.breaking();
		
		System.out.println(Drivable.DRIVE);
		
		System.out.println("-----------Object of Vehicle-----------");
		
		Vehicle v = new Bike(); // Vehicle ---> Motorcycle ---> Bike
		v.operateVehicle();
		
		
	}

}
