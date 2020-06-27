package com.syntax.class13;

public class DogShelter {
	public static void main(String[] args) {
		
		System.out.println("--------------Bulldog----------");
		Dog bulldog = new Dog();
		bulldog.breed = "French Bulldog";
		bulldog.origin = "France";
		bulldog.gender = "Male";
		bulldog.size = "11-12 in. tall and 20-28 lbs";
		bulldog.color = "Cream";
		bulldog.lifeSpan = "10-14 years";
		
		bulldog.bark();
		bulldog.rollover();
		bulldog.getNewspaper();
		bulldog.jump();
		
		
		System.out.println("------------Husky----------");
		Dog husky = new Dog();
		husky.breed = "Siberian Husky";
		husky.origin = "Russia";
		husky.gender = "Female";
	    husky.size = "20-22 in. tall and 31-51 lbs";
		husky.color = "Grey and White";
		husky.lifeSpan = "12-15 years";
		
		husky.bark();
		husky.rollover();
		husky.getNewspaper();
		husky.jump();
		
		
		System.out.println("------------Labrador----------");
		Dog Labrador = new Dog();
		Labrador.breed = "American Labrador Retriever";
		Labrador.origin = "UK";
		Labrador.gender = "Male";
		Labrador.size = "21-22 in. tall and 65-80 lbs";
		Labrador.color = "black";
		Labrador.lifeSpan = "12-14 years";
		
		Labrador.bark();
		Labrador.rollover();
		Labrador.getNewspaper();
		Labrador.jump();
	}

}
