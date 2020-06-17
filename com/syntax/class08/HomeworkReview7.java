package com.syntax.class08;

public class HomeworkReview7 {

	public static void main(String[] args) {
		// print numbers from 100 to 1

		// step 1 step 2 step 4
		for (int a = 100; a >= 1; a--) {
			System.out.println(a); // step 3
		}
		System.out.println("--------print numbers 1,2,3---------");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("                                                                    ");
		System.out.println("------------print odd numbers between 20 and 50 1st way------------");
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) { // it's an odd number
				System.out.println(i);
			}
		}
	
	System.out.println("-------------print odd numbers between 20 and 50 2nd way----------------");
	for (int i = 21; i <= 50; i +=2) {
		System.out.println(i);
	}
	
	System.out.println("-----------printing numbers between 5 and 1-----------");
	for (int j = 5; j >= 1; j--) {
		System.out.println(j);
	}
	
	
	}
}
