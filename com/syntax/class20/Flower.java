package com.syntax.class20;

public class Flower {

	String type;
	// if you are not going to create a constructor, ----> Complier WILL create 1
	// for you
//	Flower(){ // default non argument
//		
//	}

//	Flower() {
//		System.out.println("I am a pointless constructor");
//	}
	// if you create a constructor the compiler WILL NOT CREATE any other constructor for you

	private Flower(String flowerType) {
		type = flowerType;
	}

	void Flower() {
		System.out.println("Printing whatever");
	}

	public void display() {
		System.out.println(type);
	}

	public static void main(String[] args) {
//		Flower power = new Flower(); CE: since we do not have non argument constructor
//		
//		System.out.println(power.type);

		Flower flower2 = new Flower("Tulip");
		// System.out.println(flower2.type);

		flower2.display();
		flower2.Flower();
		
	}

}
