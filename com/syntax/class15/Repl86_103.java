package com.syntax.class15;

import java.util.Scanner;

public class Repl86_103 {
	public static void main(String[] args) {
		System.out.println("---------------repl 94--------------");
		String given = "I love Java classes at Syntax";
		String substr=given.substring(12);
		System.out.println(substr);
		
		substr=given.substring(0, 11);
		System.out.println(substr);
		
		
		System.out.println("---------------repl 90-------------");
		  String s1="hello"; 
		    String s2="";
		    System.out.println(s1.isEmpty());     
		    System.out.println(s2.isEmpty());
		
		    
		    
		System.out.println("-----------------repl 99---------------");
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	    givenString=givenString.replace(" ", "");
	    String reversedString="";
		
		for (int i=givenString.length()-1; i>=0; i--) {
			reversedString=reversedString+givenString.charAt(i);
		}

		boolean isPalindrome=false;
		
		if(givenString.equalsIgnoreCase(reversedString)) {
			isPalindrome=true;
		}
		
		System.out.println(isPalindrome);
		
		System.out.println("----------------------repl 101------------");
		 Scanner in = new Scanner(System.in);
		    System.out.print("In:");
		    String word = in.nextLine();
		    //write your code below
		    for (int s = 0; s < word.length(); s+=2) {
		      System.out.print(word.charAt(s));
		    }
	}

}
