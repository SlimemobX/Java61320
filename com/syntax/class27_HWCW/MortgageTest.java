package com.syntax.class27_HWCW;

public class MortgageTest {
	public static void main(String[] args) {
		
		System.out.println("------------PNC----------");
		// Objects of Trustable type
		Trustable trust = new PNC();
		trust.trust();
		
		// Objects of Investments type
		Investments invest = new PNC();
		invest.doInvestments();
		
		// Objects of Bank type
		Bank money = new PNC();
		money.withdraw();
		money.deposit();
		money.trust();
		
		// Objects of PNC type
		PNC pnc = new PNC();
		pnc.withdraw();
		pnc.deposit();
		pnc.trust();
		pnc.doInvestments();
		pnc.giveMortgage();
		
		
		System.out.println("------------BOA----------");
		// Objects of Trustable type
		Trustable trust2 = new BOA();
		trust2.trust();
		
		// Objects of Investments type
		Investments invest2 = new BOA();
		invest2.doInvestments();
		
		// Objects of Bank type
		Bank money2 = new BOA();
		money2.withdraw();
		money2.deposit();
		money2.trust();
		
		// Objects of BOA type
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
