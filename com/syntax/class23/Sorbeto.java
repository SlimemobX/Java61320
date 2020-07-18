package com.syntax.class23;

public class Sorbeto extends IceCream{

	double price;
	
	public Sorbeto(String flavor, String brand, String color, double price) {
		super(flavor, brand, color); // call to parent constructor MUST be first line
		this.price = price;	
		
	}
	
//	public Sorbeto(double price) {
//		super();
//		this.price = price;
//	}

}

class MiniSorbeto extends Sorbeto{
	
	int calories;
	
	public MiniSorbeto(String flavor, String brand, String color, double price,int calories) {
		super(flavor, brand, color,price);
		this.calories = calories;
	}
	
}
