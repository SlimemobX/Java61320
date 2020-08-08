package com.syntax.class30_HWCW;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {
	public static void main(String[] args) {
		
		LinkedList<Card> cards = new LinkedList<>();
		cards.add(new Visa("Visa"));
		cards.add(new MasterCard("MasterCard"));
		cards.add(new AmericanExpress("American Express"));
		
		System.out.println("----------- For Loop -----------");
		
		for(int i= 0; i < cards.size(); i++) {
			cards.get(i).withdraw();
			cards.get(i).getCashBack();
			System.out.println();
		}
		
		System.out.println("----------- enhanced Loop -----------");
		
		for (Card c: cards) {
			c.withdraw();
			c.getCashBack();
			System.out.println();
		}
		
		
		System.out.println("----------- Iterator -----------");
		
		Iterator<Card> cd = cards.iterator();
		
		while(cd.hasNext()) {
			Card it = cd.next();
			it.withdraw();
			it.getCashBack();
			System.out.println();
		}
		
		
		
	}

}
