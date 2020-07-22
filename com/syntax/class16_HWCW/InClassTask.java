package com.syntax.class16_HWCW;

public class InClassTask {
	// Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void largest(int a,int b) {
		if (a > b) {
			System.out.println(a + " is the largest number");
		}else {
			System.out.println(b + " is the largest number");
		}
		
	}
	
	// Create a method that will take a number and prints whether the number is even or odd.
	
	void evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a+  " is even");
		}else {
			System.out.println(a + " is odd");
		}
	}
	
	
	// Create a method that will print whether given String is palindrome or not.
	
	void isPalindrome(String word) {
		word = word.replace(" ", "");
		String rev = "";
		for (int i = word.length() - 1; i>= 0; i--){
		   	  rev = rev + word.charAt(i);
		   	}
		   	if (rev.equalsIgnoreCase(word)){
		   	  System.out.println( word + " is Palindrome");
		   	}else {
		   	  System.out.println(word+ " is NOT Palindrome");
		   	}
	}
	
	
	// Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	void sayHello(String country) {
		country = country.toLowerCase();
		
		switch (country) {
		case "usa":
			System.out.println("Hello");
			break;
		case "spain":
			System.out.println("Hola");
			break;
		case "italy":
			System.out.println("Ciao");
			break;
		case "france":
			System.out.println("Bonjour");
			default:
				System.out.println("Invalid");
				
		}
	}
	
	
	
	
	
	
	
}
