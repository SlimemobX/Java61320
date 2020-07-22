package com.syntax.class15_HWCW;

public class SwapStringsHW{
	public static void main(String[] args) {
		
		// How would you swap  2 strings without a temporary variable?
				String string1 = "Welcome";
				String string2 = "Hello";
				
				string1 = string1 + string2;
				string2 = string1.substring(0,string1.length()-string2.length());
				string1 = string1.substring(string2.length());
				
				System.out.println("a = " + string1 + " and b = " + string2);
	}

}
