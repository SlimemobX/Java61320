package com.syntax.class28;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.setAcc_no(123456789); 
		bank.setBalance(13000);
		
		System.out.println(bank.getAcc_no());
		System.out.println(bank.getBalance());
	}

}
