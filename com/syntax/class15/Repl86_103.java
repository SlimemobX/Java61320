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
		    System.out.println("----------------repl 83------------------");
		    Scanner inp1 = new Scanner(System.in);
			System.out.print("In:");
			String s = inp1.nextLine();
			// write your code below

			String newString = "";
			for (int i = 0; i <= s.length() - 1; i++) {
				
				if(i!=s.length()-1) {
					newString = newString + s.charAt(i) + " ";
				}else {
					newString = newString + s.charAt(i);
				}
				
			}
			
			System.out.println(newString);
	
			System.out.println("---------------repl 104-----------");
			Scanner input = new Scanner(System.in);
			String[] arr = new String[5];
		
		  //storing names into array
			for (int i=0;i<5;i++) {
				arr[i] = input.nextLine();
			}
			
			//printing first 3 characters of each String element
		  for(String el: arr){
		    System.out.println(el.substring(0,3));
		  }
			System.out.println("------------repl 105--------------");
			// How I did it
			  Scanner inp2 = new Scanner(System.in);
			    System.out.print("In:");
			    String word1 = inp2.nextLine();
			    //write your code below
			  for (int vowels = 0; vowels < word1.length(); vowels++){
			    char c = Character.toLowerCase(word1.charAt(vowels));
			  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			    System.out.print(word1.charAt(vowels));
			  }
			    
			  }
			  
			  // How Teacher did it
			  Scanner inp3 = new Scanner(System.in);
			    System.out.print("In:");
			    String word2 = inp3.nextLine();
			    //write your code below
			    String replace=word2.replaceAll("[^aAeEiIoOuU]", "");
			    System.out.println(replace);
			    
			    System.out.println("--------------repl 107------------");
				String givenString1 = "Hello Friends";

				StringBuffer sb = new StringBuffer(givenString1);
				sb.reverse();
			
				String reversedString1=sb.toString();
				
				System.out.println(reversedString1);
	
	}

}
