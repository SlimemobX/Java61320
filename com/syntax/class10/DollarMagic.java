package com.syntax.class10;

public class DollarMagic {
	public static void main(String[] args) {
		// $$$$
		// $  $
		// $  $
		// $  $
		// $$$$

		for (int a = 1; a <= 5; a++) { // The outer loop controls the rows
			for (int b = 1; b <= 4; b++) { // The inner loop controls the columns
				if (a == 1 || a == 5) { // in the first row print everything
					System.out.print("$");
				} else { // in the other row
					if (b == 1 || b == 4) { // in the first or last column print $
						System.out.print("$"); 
					} else { // in the other columns print " "
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}
	}

}
