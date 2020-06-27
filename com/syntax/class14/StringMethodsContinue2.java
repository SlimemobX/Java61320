package com.syntax.class14;

public class StringMethodsContinue2 {
	public static void main(String[] args) {
		
		System.out.println("----------------.charAt() method-------------");
		String season ="Summer";
		char character = season.charAt(4);
		System.out.println(character);
		
		System.out.println("-----------.index() method------------");
		int index = season.indexOf('m');
		System.out.println(index);
		
		String hello= "Hello Ksenia";
		int indexOfKsenia = hello.indexOf("Ksenia");
		System.out.println("Index of Ksenia in the String " + hello + " is = " + indexOfKsenia);
		
		System.out.println("----------.substring() methods---------------");
		String message = "You guys are awesome";
		String newMessage= message;
		System.out.println(newMessage);
		
		String part = message.substring(4); // take String starting from index 4
		System.out.println(part);
		
		String mid = message.substring(4, 8);
		System.out.println(mid);
	}

}
