package com.syntax.class19_HWCW;

public class ReturnOnlyVowelsHW {
	// Create a method that will accept a String as a parameter and return a new
	// String that consist only of vowels.
	// Method should be available inside the class where it was declared and
	// executed by calling it is name.

	private static String vowels(String str) {
		String replace = str.replaceAll("[^aAeEiIoOuU]", "");

		return replace;
	}

	public static void main(String[] args) {
		System.out.println(vowels("Goodbye"));
	}
}
