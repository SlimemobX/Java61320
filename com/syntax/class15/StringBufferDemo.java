package com.syntax.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Hello"); // is a mutable object
		
		strBuffer.append(" friend"); // when we perform operation it happens on same object and NO NEW Objects gets created
		System.out.println(strBuffer); // Hello friends
		
		String str2 = "Hello"; // String is Immutable object = not changeable
		str2.concat(" friend"); // new object gets created that will have value "Hello friends"-----> no one take it
		
		System.out.println(str2); // Hello
	}

}
