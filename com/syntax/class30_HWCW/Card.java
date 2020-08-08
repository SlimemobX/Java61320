package com.syntax.class30_HWCW;

public abstract class Card {
//	Create a Card class that will have implemented  and unimplemented methods 
//	and a constructor that will initializes credit card type.  
//	Create 3 subclasses of a Card card. 
//	Create 3 objects of different card and store them into LinkedList.
//	Using for loop/advanced for loop/ iterator access all methods of the class.
	
	String cardType;
	
	Card(String cardType){
		this.cardType = cardType;
	}
	
	public void withdraw() {
		System.out.println("Can withdraw money from " + cardType);
	}
	
	public abstract void getCashBack();
	
	
	

}

class Visa extends Card{

	Visa(String cardType) {
		super(cardType);
		
	}

	@Override
	public void getCashBack() {
		System.out.println("With " + cardType + " you can earn 5% cash back at SuperMarkets");
		
	}
	
}

class MasterCard extends Card{

	MasterCard(String cardType) {
		super(cardType);
		
	}

	@Override
	public void getCashBack() {
		System.out.println("With " + cardType + " you can earn 2% cash back at SuperMarkets");
		
	}
	
}

class AmericanExpress extends Card{

	AmericanExpress(String cardType) {
		super(cardType);
		
	}


	@Override
	public void getCashBack() {
		System.out.println("With " + cardType + " you can earn 6% cash back at SuperMarkets");
		
	}
	
}