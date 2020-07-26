package com.syntax.class28;

public class Bank {
	
	private long acc_no;
	private double balance;
	
	
	// setter
	public void setAcc_no(long acc_no) {
		// here can be validation points
		this.acc_no=acc_no;
	}
	public void setBalance(double balance) {
		// here can be validation points
		this.balance=balance;
	}
	
	// getter
	public long getAcc_no() {
		// here can be validation points
		return acc_no;
	}
	
	public double getBalance() {
		return balance;
	}
	

}
