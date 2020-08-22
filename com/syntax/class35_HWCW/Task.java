package com.syntax.class35_HWCW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		// How would handle InputMismatchException? 
		// Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		Scanner scan = new Scanner(System.in);
	
		
		try {
			
				System.out.println("Enter number");
				int num = scan.nextInt();
			
		}catch (InputMismatchException ime) {
			System.out.println(ime);
		}
		 
		
	}

}
