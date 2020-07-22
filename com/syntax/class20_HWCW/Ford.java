package com.syntax.class20_HWCW;

public class Ford {
	public static void main(String[] args) {
		Task1_Ford car = new Task1_Ford();
		car.model = "Fusion";
		car.year = 2011;
		car.displayInfo();
	
		
		Task1_Ford car1 = new Task1_Ford("Mustang", 2018);
		car1.displayInfo();
		
				
	}

}
