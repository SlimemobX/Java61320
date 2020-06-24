package com.syntax.class12;

public class InClassTask {
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
	
	System.out.println("-----------------------------------");
	// lets create a 2D array of int and calculate sum of all odd numbers
	int[][] numbers = {
			{10,23,56,47},
			{33,668,89},
			{1,9,0}
			
	};
	// Regular for loop
	int sum =0;
	for (int i = 0; i<numbers.length;i++) {
		for (int j = 0; j < numbers[i].length; j++) {
			int element = numbers[i][j];
			if (element % 2 != 0) {
				sum += element;
			}
			
		}
	System.out.println(sum);
	}
	
	
	
	}

}
