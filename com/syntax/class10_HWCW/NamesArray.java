package com.syntax.class10_HWCW;

public class NamesArray {
	public static void main(String[] args) {

		// Create an array of names and store all names of your group.
		// Then print your name from that array. (use 2 different ways of creating an
		// array).

		String[] names = new String[5];
		names[0] = "Irwin";
		names[1] = "Josue";
		names[2] = "Alex";
		names[3] = "Kelvin";
		names[4] = "Olvan";

		System.out.println(names[0]);

		String[] nombres = { "Josue", "Kelvin", "Olvan", "Alex", "Irwin" };
		System.out.println(nombres[4]);
	}

}
