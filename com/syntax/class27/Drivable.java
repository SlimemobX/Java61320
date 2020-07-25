package com.syntax.class27;

public interface Drivable {//interface is collection of public abstract methods and public static final variables

  	String DRIVE="Drive safe";//by default compiler adds public static final to variables

  	//int maxSpeed; cannot have instance variables because compiler adds PSF

  	void driving();//by default compiler adds public abstract to methods

  	void breaking();
 }
// we can extends ONLY 1 class but we can implement multiple interfaces
  abstract class Motorcycle extends Vehicle implements Drivable {//abstract class

  	public void driving() {
 		System.out.println("Motorcycle is driving");
 	}
  	
	public void breaking() {
 		System.out.println("Bikes can break");
 	}

 }
  class Bike extends Motorcycle {//concrete class

  	public void breaking() {
 		System.out.println("Bikes can break");
 	}

}
  class Vehicle{
	  public void operateVehicle() {
		  System.out.println("To operate any vehicle we need to have driver license");
	  }
	  
  }

  
  
