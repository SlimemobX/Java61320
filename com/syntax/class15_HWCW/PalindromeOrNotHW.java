package com.syntax.class15_HWCW;

import java.util.Scanner;

public class PalindromeOrNotHW {
	public static void main(String[] args) {

		// How would you check if String is palindrome or not?
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word or phrase");
		String input = scan.nextLine();
		input = input.replace(" ", "");
		String rev = "";
		
		for (int i = input.length() - 1; i>= 0; i--){
		   	  rev = rev + input.charAt(i);
		   	}
		   	if (rev.equalsIgnoreCase(input)){
		   	  System.out.println("true");
		   	}else {
		   	  System.out.println("false");
		   	}
		
		
	}

}
