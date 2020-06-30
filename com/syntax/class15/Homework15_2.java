package com.syntax.class15;

import java.util.Scanner;

public class Homework15_2 {
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
		// How would you swap  2 strings without a temporary variable?
		String string1 = "Welcome";
		String string2 = "Hello";
		
		string1 = string1 + string2;
		string2 = string1.substring(0,string1.length()-string2.length());
		string1 = string1.substring(string2.length());
		
		System.out.println("a = " + string1 + " and b = " + string2);
		
	}

}
