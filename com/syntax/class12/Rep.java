package com.syntax.class12;

public class Rep {
	public static void main(String[] args) {
		// repl #67
//		for (int a =1; a <=5; a++) {
//			for (int b=1; b <=10; b++) {
//				System.out.print(a * b + " ");
//			}
//		System.out.println();
//		}
	
		// repl 75
		  int[] num = {45,78,12,67,55,89,23,77,88};
		   for (int a = 1; a < num.length; a+=3){
		     System.out.print(num[a] + " ");
		   }
		System.out.println();
		   
		// repl 82
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
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
		
		
	
	}

}
