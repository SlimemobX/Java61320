package com.syntax.class28_HWCW;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("---------Sedan----------");
		
		Sedan sedan = new Sedan();
		double price= sedan.calculateSalePrice(25000,"Blue",29);
		System.out.println(price);
		
		
		
		
		System.out.println("--------Truck-----------");
		Truck truck = new Truck();
		double cost = truck.calculateSalePrice(30000, "Black",1850);
		System.out.println(cost);
		
		
	}

}
