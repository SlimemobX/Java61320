package com.syntax.class30_HWCW;

import java.util.ArrayList;

public class Words {
	
	public static void main(String[] args) {
	// Create an arrayList of words. Remove every word that ends with “e”.
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Bye");
		words.add("Day");
		words.add("Leave");
		words.add("Morning");
		words.add("Live");
		words.add("Black");
		
		System.out.println(words);
		
		System.out.println("--------- Removing words ending with e ----------");
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).endsWith("e")) {
				words.remove(i);
			}
		}
		
		System.out.println(words);
		
		
		
		
	}

}
