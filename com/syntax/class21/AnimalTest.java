package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
	
		// object of parent class has access to all var and methods of it is own class ONLY
		Animal a = new Animal();
		a.breed= "Something";
		a.color="grey";
		a.paws=4;
		
		
		a.sleep();
		a.eat();
		
		// object of child class has access to all var and methods of it is parent class and its own class
		System.out.println("---------Dog-----------");
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color ="Yellow";
		dog.paws = 4;
		dog.tail = true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		System.out.println("---------Cat-----------");
		Cats cat = new Cats();
		cat.breed = "Meowth";
		cat.color ="White";
		cat.paws = 4;
		cat.tail = true;
		cat.fur ="Soft";
		
		cat.eat();
		cat.sleep();
		cat.purr();
		
		System.out.println("--------Kitten---------");
		Kitten_HW kit = new Kitten_HW();
		kit.breed = "meowth";
		kit.color = "Black";
		kit.paws = 4;
		kit.tail = true;
		kit.fur = "soft";
		
		kit.eat();
		kit.sleep();
		kit.food();
		
		
		
	}
}
