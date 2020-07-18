package com.syntax.class23;

public class Italy extends Country{
	String food;

	Italy(String name, String food) {
		super(name); // compiler adds by default, only for non-argument constructors
		this.food = food;

	}
	
	 void foods() {
			System.out.println("The food " + food + " is from " + name);
		}

}
