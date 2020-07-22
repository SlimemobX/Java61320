package com.syntax.class12_HWCW;

public class CountriesFood2DArray {
	public static void main(String[] args) {
		/*store a 2D that will store food of different kinds
		 * retrieve all values from that array using 2 different loops
		 * 
		 * 
		 */
	
	String[][] food = {
			{ "Cheeseburger", "Hotdogs", "Chicken Fried Steak"},
			{ "Pizza", "Lasagna", "Risotto"},
			{ "Crepes", "Ratatouille", "Chocolate Mousse"}
	};
	// for loop
	for (int a = 0; a < food.length; a++) {
		for (int b =0; b < food[a].length; b++) {
			String food2 = food[a][b];
			System.out.println(food2);
		}
	}
	
	// enhanced loop
	for (String[] array:food) {
		for (String food1:array) {
			System.out.print(food1 + " ");
		}
	System.out.println();
	}
	}

}
