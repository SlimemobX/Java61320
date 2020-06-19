package com.syntax.class09;

public class MorePattern {
	public static void main(String[] args) {
		// 12345
		// 12345
		// 12345

		// how many rows? 3
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------------Task------------");
		// 11111
		// 22222
		// 33333
		// 44444
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
