package com.syntax.class14;

public class StringMethod {
	public static void main(String[] args) {
		
		// 1st way to create a String this is the most popular way
		String name = "Olga"; // literal
		
		// 2nd way to create String using new keyword
		String name1 = new String();
		name1 = "Olga";
		
		System.out.println(name);
		System.out.println(name1);
		
		
		System.out.println("------------.length() method------------");
		// methods of String class
		String school = "Syntax";
		// How many characters are in the string
		int size = school.length();
		System.out.println("The length of the String is = " + size);
		
		
		String greetings  = "Hello Syntax";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);
		
		System.out.println("-----------.toUpperCase() method--------------");
		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("-----------.toLowerCase() method--------------");
		String lowerCaseString = newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("-------------.concat() method------------------");
		String country = "USA";
		String capital = "Washington DC";
		
		// + with Strings serve as concatenation operator
		// + with numbers serves as arithmetic operator
		System.out.println(country + " = " + capital);
		System.out.println(country.concat(capital)); // will work only if both values are of String type
		
		int day = 27;
		String month = " June";
		System.out.println(day+month);
		System.out.println(month+day);
	
		// System.out.println(month.concat(day)); // cannot use, both value must be String
		// System.out.println(day.concat(month)); // CE: day is an int type and it does not have access to Strong method
		
		System.out.println("----------------.isEmpty() method--------------");
		// if length of the String is = 0 ---> then it is empty
		String str = " ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("------------.trim() method-------------");
		
		String cat = "My cat name is Jessy";
		String dog = "      My dog name is    Charlie      ";
		System.out.println("---------Before Trimming-------------");
		System.out.println(cat);
		System.out.println(dog);
		
		System.out.println("------------After Trimming------------");
		System.out.println(cat.trim());
		System.out.println(dog.trim());
	}
	

}
