package com.syntax.class15_HWCW;

public class SentenceWithoutSpaces {
	public static void main(String[] args) {
		// Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.

		String ab = "How are you this afternoon?";
		ab = ab.replaceAll(" ", "");
		System.out.println(ab);
	}

}
