package com.syntax.class11_HWCW;

public class CountriesArray {
	public static void main(String[] args) {
				
	// Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
	// Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
		String[] countries = {"Canada", "Chile", "Kenya", "Finland", "Japan"};
		for (int c = 0; c < 5; c++) {
			System.out.println(countries[c]);
		}
		
		 System.out.println();
		
		int c = 0;
		while (c < countries.length) {
			System.out.println(countries[c]);
			c++;
		}
	
		int country = countries.length;
		System.out.println("There are a total of " + country + " stored");
		
	}

}
