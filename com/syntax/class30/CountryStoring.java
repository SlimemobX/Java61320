package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class CountryStoring {
	public static void main(String[] args) {
		
		Country[] countr = {new USA("USA"),new Kazakhstan("Kazakhstan"), new Afghanistan("Afghanistan") };
		
		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));// 0
		countries.add(new Kazakhstan("Kazakhstan"));// 1
		countries.add(new Afghanistan("Afghanistan"));// 2
		
		
		System.out.println("----------- For Loop -----------");
		
		for (int i = 0; i < countries.size(); i++) {
			countries.get(i).election();
		}
		
		
		System.out.println("----------- enhanced Loop -----------");
		
		for (Country ct: countries) {
			ct.election();
		}
		
		System.out.println("----------- Iterator -----------");
		
		Iterator<Country> country = countries.iterator();
		
		while(country.hasNext()) {
			country.next().election();
		}
		
		
		
		
	}

}
