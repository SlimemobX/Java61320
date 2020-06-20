package com.syntax.class10;

import java.util.Scanner;

public class RecapFloorsAndRooms {
	public static void main(String[] args) {
		// there are 4 floors
		// Room numbers go from 1.1, 1.2 .... 1.7

		// ask the user how many floors does your hotel have
		// and how many rooms in each floor

		// If I want, i can read floors and rooms from a scanner

		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		System.out.println("How many rooms in each floor?");
		int rooms = scan.nextInt();

		for (int i = 1; i <= floors; i++) {
			// we just moved to a new floor
			System.out.print("We are in floor " + i + "-------> ");

			// we are iterating the rooms
			for (int j = 1; j <= rooms; j++) {
				System.out.print(i + "." + j + " ");
			}
			// The stairs to the next floor
			System.out.println();
		}

	}

}
