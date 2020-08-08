package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {
	
	public static void main(String[] args) {
		
		// we need to store objects of Health, Pet, Car
		Set<Insurance> lset = new LinkedHashSet<>();
		
		lset.add(new Pet("Cat" , "Cigna"));
		lset.add(new Car("Telsa", "Geico"));
		lset.add(new Health("Blue Cross Blue Shield"));
		
		
		// how to access variable and methods?
		for(Insurance ins: lset) {
			System.out.println(ins.insuranceName);// accessing variables
			// calling methods
			ins.getQuote();
			ins.cancelInsurance();
			System.out.println("-----------------");
		}
		
		
		
		
		System.out.println("---------Using Iterator--------");
		
		Iterator<Insurance> insure = lset.iterator();
		while(insure.hasNext()) {
			Insurance in = insure.next();
			System.out.println(in.insuranceName);
			in.getQuote();
			in.cancelInsurance();
			System.out.println("----------");
			
		}
		
	}

}
