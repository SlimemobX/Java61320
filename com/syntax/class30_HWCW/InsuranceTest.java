package com.syntax.class30_HWCW;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	
	public static void main(String[] args) {
		
		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Ford","State Farm"));
		insurance.add(new Pet("German Shepard","NationWide"));
		insurance.add(new Health("Kaiser Permanente"));
		
		
		System.out.println("----------- For Loop -----------");
		for (int i =0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
			System.out.println();
		}
		
		System.out.println("----------- enhanced Loop -----------");
		for (Insurance in: insurance) {
			in.getQuote();
			in.cancelInsurance();
			System.out.println();
		}
		
		
		System.out.println("----------- Iterator -----------");
		
		Iterator<Insurance> ins = insurance.iterator();
		while(ins.hasNext()) {
			Insurance insure = ins.next();
			insure.getQuote();
			insure.cancelInsurance();
			System.out.println();
		}
		
		
	}

}
