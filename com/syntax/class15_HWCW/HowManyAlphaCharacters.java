package com.syntax.class15_HWCW;

public class HowManyAlphaCharacters {
	public static void main(String[] args) {

		// Create a String that should be combination of letters, numbers and special
		// characters.
		// Find out how many alpha characters are there in the String.

		String b = "Hello 328574875 friend $#%&&";
		b = b.replaceAll("[^A-za-z]", "");
		int length = b.length();
		System.out.println(length);
	}

}
