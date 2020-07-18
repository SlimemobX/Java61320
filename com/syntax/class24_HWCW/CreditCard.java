package com.syntax.class24_HWCW;

public class CreditCard {
//	Create a class CreditCard and define variable balance and interest. 
//	Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.
	
	double balance, interest;
	
	
	
	double cal(double balance) {
		this.balance = balance;
		interest = balance * .05;
		return interest;
		
	}
	

}

class Visa extends CreditCard{
	double cal(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
		System.out.println(balance * interest);
		return balance *interest;
		
	}

}

class AX extends CreditCard{
	
	
	double cal(double balance) {
		this.balance = balance;
		interest = balance * .07;
		return interest;
		
	}
	
}
