package com.syntax.class24_HWCW;

public class CreditCardTest {
	public static void main(String[] args) {
		
		Visa visa = new Visa();
		double interest = visa.cal(1250);
		System.out.println(interest);
		
		
		AX ax = new AX();
		double intr = ax.cal(1000);
		System.out.println(intr);
		
		
		Visa v = new Visa();
		v.cal(1300, .12);

	}

}
