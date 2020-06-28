package com.syntax.class15;

public class StringImmutable {
	public static void main(String[] args) {
		
		String str = "Today is a good day";
		
		str =str.replace("good", "amazing");
		
		System.out.println(str);
		
		str.concat(".I love Sunday");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		String str1 = new String("Hello");
		str1 = str1.toUpperCase();
		System.out.println(str1);
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";
	}

}
