package com.syntax.class07;

public class InClassTask {
	public static void main(String[] args) {
		// how to print 50 to 1
		// how to print odd numbers from 1 to 20
		
		int a = 50;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
	
		System.out.println("-----------1st Way--------------");
		
		// 1 way, using mod %
		int x = 1;
		while (x < 20) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		}
		
		
		System.out.println("----------2nd Way---------------");
		
		// 2nd way, increasing by 2
		int b = 1;
		while (b < 20) {
			System.out.println(b);
			b += 2;
		}
	
		System.out.println("------------3rd Way-------------");
		
		// 3rd way 
		int z = 0;
		while (z < 20) {
			z++;
			System.out.println(z);
			z++;
		}
	
		System.out.println("-----------4th Way--------------");
		// 4th way
		int y = 0;
		while (y < 20) {
			System.out.println(++y);
			y++;
		}
	
	
	}

}
