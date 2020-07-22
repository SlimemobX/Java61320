package com.syntax.class15_HWCW;

public class HowManySentences {
	public static void main(String[] args) {

		// You have a String a=“Is it Saturday? Is it raining? Do we have a Java Class
		// today?”
		// How would you find out how many sentences are in that String?

		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("[?]");
		int sentence = array.length;
		System.out.println("The total number of sentences are: " + sentence);

	}

}
