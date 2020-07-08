package com.syntax.class18;

public class HouseCat {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat(); // ----> local variable
		cat1.name ="Jessy";
		cat1.age = 8;
		cat1.color = "grey"; // accessing instance variable and
		// to access static variables we use name of the class where the objects are
		System.out.println("Number of paws = " + Cat.paws);
		
		String color = "Yellow"; // declaring local variable
		
		
		Cat cat2 = new Cat();
		cat2.name ="Lucy";
		cat2.age = 1;
		cat2.color = "white";
		cat2.name = "Bonchuk";
		cat2.mustache = false; // possible way but not the right way
		Cat.tail = false;// best way
		
		
		Cat cat3 = new Cat();
		cat3.name ="Kathy";
		cat3.age = 4;
		cat3.color = "black";
		
//		System.out.println("Name of 1st cat = " + cat1.name);
//		System.out.println("Age of cat " + cat1.age);
//		
//		System.out.println("Name of 2nd cat = " + cat2.name);
//		System.out.println("Name of 3rd cat = " + cat3.name);
		
		System.out.println("-----------Printing values of cat 1--------");
		cat1.displayCat();
		cat1.displayCommonFeatures();
		System.out.println("-----------Printing values of cat 2--------");
		cat2.displayCat();
		cat2.displayCommonFeatures();
		System.out.println("-----------Printing values of cat 3--------");
		cat3.displayCat();
		cat3.displayCommonFeatures();
		
	}

	

}
