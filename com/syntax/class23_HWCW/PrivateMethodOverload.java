package com.syntax.class23_HWCW;

public class PrivateMethodOverload {
	//	Create 1 class with a private method that has 3 overloaded forms. 
   //	Then call each overloaded method with specific arguments and observe result.
	

	
	private PrivateMethodOverload(String name) {
		System.out.println("The name is " + name);
	}
	
	private PrivateMethodOverload(String name, String lastName) {
		System.out.println("The name is " + name + " " + lastName);
	}
	
	private PrivateMethodOverload(String name, String lastName, int age) {
		System.out.println("The name is " + name + " " + lastName + " and age is " + age);
	}
	

	public static void main(String[] args) {
		 PrivateMethodOverload pm = new  PrivateMethodOverload("James");
		 
		 PrivateMethodOverload pm2 = new  PrivateMethodOverload("Clay","Rodgers");
		 
		 PrivateMethodOverload pm3 = new  PrivateMethodOverload("Blake", "Riley", 25);
		
		 
		 
		 
	}
	
	
}
