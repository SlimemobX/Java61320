package com.syntax.class12;

public class Rep {
	public static void main(String[] args) {
		System.out.println("-----------repl 67- print out pattern------------ ");
		// repl 67
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 10; b++) {
				System.out.print(a * b + " ");
			}
			System.out.println();
		}

		System.out.println("-----------repl 75- extract values-------------");
		// repl 75
		int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int a = 1; a < num.length; a += 3) {
			System.out.print(num[a] + " ");
		}
		System.out.println();

		System.out.println("-----------repl 82- sum of all values-----------");
		// repl 82
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
//		int sum = 0;
//		for (int [] row : a){
//		  for (int col:row) {
//		    sum += col;
//		  }
//		}
//		System.out.println(sum);

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];

			}
		}
		System.out.println(sum);

		System.out.println("------------repl 85- even index && Even row--------------");
		// repl 85
		int[][] z = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int total = 0;

		for (int i = 0; i < z.length; i++) {

			for (int j = 0; j < z[i].length; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					total = total + z[i][j];
				}
			}

		}
		System.out.println(total);

		System.out.println("------------repl 84- negative && odd------------");
		int[][] t = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		for (int m = 0; m < t.length; m++) {
			for (int n = 0; n < t[n].length; n++) {
				if (t[m][n] % 2 == 1 && t[m][n] < 0) {

				}
				System.out.println(t[m][n]);
			}

		
		}

	
	}

}
