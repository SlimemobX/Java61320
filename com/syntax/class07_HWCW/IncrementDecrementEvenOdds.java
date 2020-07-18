package com.syntax.class07_HWCW;

public class IncrementDecrementEvenOdds {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------Evens---------------------------------------------------------------");
		//1.Print even numbers from 20 to 1 (2 ways)
		
		System.out.println("                                        ");
		System.out.println("-----------------1st Way----------------");
		int c = 20;
		while (c > 1) {
			System.out.println(c);
			c -= 2;
		}
		
		System.out.println("----------------2nd Way------------------");
		int d = 20;
		while (d > 1) {
			if (d % 2 == 1) {
			System.out.println(d);
			
			}
		d--;
		
		}
				
		System.out.println("--------------------------------------Odds-------------------------------------------------------------------");
		
		//1.Print odd numbers between 20 and 50 (2 ways)
		
		System.out.println("                                  ");
		System.out.println("--------------1st Way-------------");
		int e = 20;
		while (e < 50) {
			System.out.println(++e);
			e++;
		}
		
		System.out.println("-------------2nd Ways---------------");
		int f = 20;
		while (f < 50) {
			if (f % 2 == 1) {
				System.out.println(f);
			}
			f++;
		}
	}

}
