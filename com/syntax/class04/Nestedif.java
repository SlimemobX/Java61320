package com.syntax.class04;

public class Nestedif {
	public static void main(String[] args) {
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20; // 8 pm
		
		if (isMorning) {
			System.out.println("Good Morning");
			if (isSchool) {
				System.out.println("Friends");
			}else {
				System.out.println("Family");
			}
			System.out.println("Bye");
		}else {
			System.out.println("It is not Morning");
			if (time < 18) {
				System.out.println("Good afternon");
			}else {
				System.out.println("Good evening");
			}
		}
	
	System.out.println("Vika has no question");
	}

}
