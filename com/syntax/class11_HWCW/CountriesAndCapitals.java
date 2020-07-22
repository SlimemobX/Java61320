package com.syntax.class11_HWCW;

public class CountriesAndCapitals {
	public static void main(String[] args) {
		System.out.println("------------Task 3-------------");
		System.out.println("                               ");
		// Create an array of countries. while retrieving all values from an array
		// print capital for each country. using if or switch

		String[] countries = { "USA", "Honduras", "Spain", "England", "France" };
		
		System.out.println("--------Elion Way---------");
		
		String[] capitalCities = { "Washington, DC", "Tegucigalpa", "Madrid", "London", "Paris"};
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			String cities = capitalCities[i];
			System.out.println("Th capital city of " + country + " is " + cities);
		}
		
		
		System.out.println("----------Using If Else-------------");
		for (String country:countries) {
			if (country.equals("USA")) {
				System.out.println("Washington, DC");
			}else if (country.equals("Honduras")) {
				System.out.println("Tegucigalpa");
			}else if (country.equals("Spain")) {
				System.out.println("Madrid");
			}else if (country.equals("England")) {
				System.out.println("London");
			}else if (country.equals("France")) {
				System.out.println("Paris");
			}else {
				System.out.println("country is not on the list");
			}
			
		}		
		System.out.println("--------------- Using Switch--------------");
			String capital = null ;
			for (String c : countries) {
				
			switch (c) {

			case "USA":
				capital = "Washington, DC";
				break;
			case "Honduras":
				capital = "Tegucigalpa";
				break;
			case "Spain":
				capital = "Madrid";
				break;
			case "England":
				capital = "London";
				break;
			case "France":
				capital = "Paris";
				break;
			default:
				capital = "Invalid";
			}
		System.out.println("The capital of " + c + " is " + capital);
			
			}

	}

}
