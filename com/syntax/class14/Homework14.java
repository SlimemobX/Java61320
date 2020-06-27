package com.syntax.class14;

import java.util.Scanner;

public class Homework14 {
	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters, 
		// print the character in the middle of the String.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String str = scan.next();
		
		if (!str.isEmpty()) {
			if (str.length()% 2 ==1  &&  str.length() > 3) {
				System.out.println(str.charAt(str.length()/2));
		}
			
		}else {
			System.out.println("It is empty");
		}
		

		
		System.out.println("-------------Reverse-------------");
		
		// 	Create a String and print it in reverse order (Sunday → yadnuS).
		
		String weekend = "Sunday";
		String reverse = "";
		
		for (int s = weekend.length() -1; s >= 0; s--) {
			reverse = reverse + weekend.charAt(s);
		}
		System.out.println(reverse);
		
		
	}

}
