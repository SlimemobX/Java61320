package com.syntax.class14;

public class StringMethodsContinue {
	public static void main(String[] args) {
		System.out.println("--------------- .contain() method-------------");
		// checks if String contains another sequence of specified characters
		String str = "Good afternoon all";
		
		
		boolean contains = str.contains("afternoon");
		System.out.println(contains);
		
		String searchValue = "good";
		boolean isItThere =str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("a"));
		System.out.println(str.contains("after "));
		
		System.out.println("---------------------.startWith() method----------------");
		
		String drink = "water";
		boolean starts = drink.startsWith("Welcome");
		System.out.println(starts);
		
		
		System.out.println("---------------------.endsWith() method----------------");
		boolean ends = drink.endsWith("a");
		System.out.println(ends);
		
		// drink.startsWith('w'); CE: we need to check if it starts with specified String, cannot be just char
		
		String str1 = "Hello Mohammad";
		String str2 = "Hello Bulat";
		
		System.out.println("String " + str1 + " " +  str1.startsWith("Hello"));
		System.out.println("String " + str2 + " " + str2.endsWith("Bulat"));
		
		System.out.println("---------------.equals() method----------------");
		String string1 = "Saturday";
		String string2 = "Sunday";
		
		boolean equality = string1.equals(string2);
		System.out.println(equality);
		
		System.out.println("---------------.equalsIgnoreCase() method---------------");
		
		boolean equalityNoCase = string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase);
		
		System.out.println("----Real Example of equals----");
		String expected = "Password Cannot be empty";
		String actual = "Password cannot be empty";
		
		if (expected.equals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		
		System.out.println("-----Real Example of equalsIgnoreCase--------");
		String expectedBrowser = "Chrome";
		if (expectedBrowser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test executed on Chrome Browser");
		}else {
			System.out.println("Test executed NOT on Chrome Browser");
		}
		
		
	}

}
