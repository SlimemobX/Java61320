package com.syntax.class15;

public class HomeworkReview3 {
	public static void main(String[] args) {
//	 	Create a String and print it in reverse order (Sunday → yadnuS).
		
//			String weekend = "Sunday";
//			String reverse = "";
//			
//			for (int s = weekend.length() -1; s >= 0; s--) {
//				reverse = reverse + weekend.charAt(s);
//			}
//			System.out.println(reverse);
			
			
			String day = "Sunday";
			// String ---> char ----> sorry cannot call String method because you are not a String
			// day.charAt().toUpperCase();
			
			 char letter = day.toUpperCase().charAt(1);
			int lengthOfNewDay = day.substring(3).toUpperCase().length(); // 3
			System.out.println(lengthOfNewDay);
			
			for (int i = day.length() - 1; i >= 0; i--) {
				char letters = day.charAt(i);
				System.out.print(letters);
			}
			
			
			
	}

}
