package com.syntax.class04_HWCW;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		
		// you are a loan specialist and you need to ask user what is the amount of loan is needed
				//if loan is less or equal to 200,000 then you would lend the money
				// otherwise you would reject the client
				
				Scanner scan = new Scanner(System.in);
				System.out.println("What is the amount of loan is needed?");
				int loanAmount = scan.nextInt();
				if (loanAmount <= 200000) {
					System.out.println("The loan was be approved");
				}else {
					System.out.println("The client has been rejected");
				}
		
	}

}
