package com.syntax.class15;

public class StringImmutable {
	public static void main(String[] args) {

		String str = "Today is a good day"; // new object get created

		str = str.replace("good", "amazing"); // new object get created and that object is assigned to str

		System.out.println(str);

		str.concat(".I love Sunday"); // new object created but no one is referring to that object
		System.out.println(str); // original str did not get changed

		str.toUpperCase(); // object created but no one is referring to that object
		System.out.println(str); // original str did not get changed

		String str1 = new String("Hello");

		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";
		
		str2 = str2.toUpperCase(); // completely new String object is getting created
		System.out.println(str1);
		System.out.println("Value of str2 after assignment = " + str2);
		System.out.println("Value of str3 after assignment = " + str3);
		System.out.println("Value of str4 after assignment = " + str4);
		
		String str5 = new String("Hello");
	}

}
