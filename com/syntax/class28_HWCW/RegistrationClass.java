package com.syntax.class28_HWCW;

public class RegistrationClass {
	public static void main(String[] args) {
		
		Registration register =  new Registration();
		register.setEmail("Ferrufino@yahoo");
		register.setUserName("Ferrufino");
		register.setPassword("Sandoval");
		
		
		System.out.println();
		System.out.println("email: " + register.getEmail());
		System.out.println("username: " + register.getUserName());
		System.out.println("Password: " + register.getPassword());
		
		
		
		
//		System.out.println();
//		
//		Registration2 r =  new Registration2();
//		r.setEmail("Ferrufno@yahoo.com");
//		r.setUserName("Sandoval");
//		r.setPassword("fdnefhff");
//		
//		
//		System.out.println();
//		System.out.println("email: " + r.getEmail());
//		System.out.println("username: " + r.getUserName());
//		System.out.println("Password: " + r.getPassword());
		
		
	}
}
