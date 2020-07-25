package com.syntax.class27_HWCW;

public class MortgageTest {
	public static void main(String[] args) {
		
		System.out.println("------------Objects of PNC----------");
		Trustable trust = new PNC();
		trust.trust();
		
		
		Bank money = new PNC();
		money.withdraw();
		money.deposit();
		money.trust();
		
		PNC pnc = new PNC();
		pnc.withdraw();
		pnc.deposit();
		pnc.trust();
		pnc.doInvestments();
		pnc.giveMortgage();
		
		
		System.out.println("------------Objects of BOA----------");
		Trustable trust2 = new BOA();
		trust2.trust();
		
		
		Bank money2 = new BOA();
		money2.withdraw();
		money2.deposit();
		money2.trust();
		
		BOA boa = new BOA();
		boa.withdraw();
		boa.deposit();
		boa.trust();
		boa.doInvestments();
		// boa.giveMortgage();
		
		
		System.out.println("------------Using Array----------");
		Trustable[] t = {new PNC(), new BOA()};
		for (Trustable t2: t) {
			t2.trust();
		}
		System.out.println("------------------");
		
		Investments[] i = {new PNC(),new BOA()};
		for (Investments i2: i) {
			i2.doInvestments();
		}
		
		System.out.println("------------------");
		Bank[] b = {new PNC(),new BOA()};
		for (Bank b2: b) {
			b2.deposit();
			b2.withdraw();
			b2.trust();
		}
		
		
		
		
		
	}

}
