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
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color ="Yellow";
		dog.paws = 4;
		dog.tail = true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		
		Cats cat = new Cats();
		cat.breed = "Meowth";
		cat.color ="White";
		cat.paws = 4;
		cat.tail = true;
		cat.fur ="Soft";
		
		cat.eat();
		cat.sleep();
		cat.purr();
		
	}
}
