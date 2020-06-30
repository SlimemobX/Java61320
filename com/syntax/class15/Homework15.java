package com.syntax.class15;

import java.util.Scanner;

public class Homework15 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String input = scan.nextLine();
		String reverse = "";
		
		for (int s = input.length() -1; s >= 0; s--) {
			reverse = reverse + input.charAt(s);
		}
		System.out.println(reverse);


		// How would you reverse a String word by word?

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String in = sc.nextLine();
		
		String[] rev = in.split(" ");
		for (int i = rev.length  - 1; i >= 0; i--) {
			System.out.print(rev[i] + " ");
		}
		

	}

}
