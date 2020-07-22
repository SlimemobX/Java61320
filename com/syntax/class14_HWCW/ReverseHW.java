package com.syntax.class14_HWCW;

public class ReverseHW {
	public static void main(String[] args) {
		
System.out.println("-------------Reverse-------------");
		
		// 	Create a String and print it in reverse order (Sunday → yadnuS).
		
		String weekend = "Sunday";
		String reverse = "";
		
		for (int s = weekend.length() -1; s >= 0; s--) {
			reverse = reverse + weekend.charAt(s);
		}
		System.out.println(reverse);
	}

}
