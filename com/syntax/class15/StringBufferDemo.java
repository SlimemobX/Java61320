package com.syntax.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Hello"); // is a mutable object
		
		strBuffer.append(" friend"); // when we perform operation it happens on same object and NO NEW Objects gets created
		System.out.println(strBuffer); // Hello friendsa
		
		String str2 = "Hello";
		str2.concat(" friend");
		
		System.out.println(str2); // Hello
	}

}
