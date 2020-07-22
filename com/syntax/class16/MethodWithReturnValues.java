package com.syntax.class16;

import com.syntax.class16_HWCW.InClassTask;

public class MethodWithReturnValues {
	public static void main(String[] args) {
		// create a String and based on the number of character define whether String is
		// long or short
		// String is long or short
		// long if length > 10, short if less

		String str = "I Love Java";

		int length = str.length();

		if (length > 10) {
			System.out.println("Created String is long");
		} else {
			System.out.println("Created String is short");
		}

	}
// create a method that will RETURN the largest number
	int larger(int a, int b) {
		int larger;
		if (a > b) {
			larger = a;
		} else {
			larger = b;
		}
		return larger;
	}
}
