package com.syntax.class15;

public class SplitFunction {
	public static void main(String[] args) {
		String str = "Today is Sunday and we have a Java Class";
		
		
		String[] array = str.toLowerCase().split("s");
		int howManyElements = array.length;
		System.out.println(howManyElements);
		
		// enhanced loop
		for (String s:array) {
		System.out.print(s + "|");
		}
	System.out.println();
	}

}
