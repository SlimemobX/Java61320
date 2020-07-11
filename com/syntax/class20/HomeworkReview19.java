package com.syntax.class20;

public class HomeworkReview19 {
	public static void main(String[] args) {
		System.out.println(rev("Hello"));
		System.out.println(reverse("Hello"));
	}

	public static String rev(String str) {
		String a = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			a += str.charAt(i);
		}
		return a;
	}

	
	public static StringBuffer reverse(String a) {
		StringBuffer strb = new StringBuffer(a);
		return strb.reverse();
	}
	
	

}
