package com.syntax.class27_HWCW;

public interface Trustable {
	void trust();

}

interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
}

class PNC extends Mortgage implements Bank,Investments{

	@Override
	public void deposit() {
		System.out.println("PNC bank takes deposits");
		
	}
	
	@Override
	public void withdraw() {
		System.out.println("PNC gives you your money");
		
	}
	
	@Override
	public void trust() {
		System.out.println("You can trust PNC with your money");
		
	}
	
	@Override
	protected void giveMortgage() {
		System.out.println("PNC gives mortgage");
		
	}
	
	@Override
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
		
	}
	
}

class BOA implements Bank,Investments{
	
	@Override
	public void deposit() {
		System.out.println("BOA bank takes deposits");
		
	}
	
	@Override
	public void withdraw() {
		System.out.println("BOA gives you your money");
		
	}
	
	@Override
	public void trust() {
		System.out.println("You can trust BOA with your money");
		
	}

	@Override
	public void doInvestments() {
		System.out.println("You can invest your money with BOA");
		
	}
	
	
}
