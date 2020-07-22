package com.syntax.class14_HWCW;

import java.util.Scanner;

public class IsEmptyOddChar3OrMoreChar {
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
	
		
		
	}

}
