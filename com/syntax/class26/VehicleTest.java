package com.syntax.class26;

public class VehicleTest {
	public static void main(String[] args) {
		
		Vehicle lambo =new Lamborgini("VDDFW3298598243DFD");
		lambo.drive();
		lambo.stop();
		lambo.start();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);
		
		
		System.out.println("----------Second Object-----------");
		Car car =new Lamborgini("VDDFW843267526DFD");
		car.drive();
		car.stop();
		car.start();
		car.openTrunk();
		total = car.getTotal();
		System.out.println(total);
	
		
	}

}
