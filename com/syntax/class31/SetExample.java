package com.syntax.class31;

import java.util.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		// creating an object of HashSet
		System.out.println("--------------HashSet---------------");
		HashSet<String> brands = new HashSet();
		brands.add("Nike");
		brands.add("Adidas");
		brands.add("H&M");
		brands.add("Zara");
		brands.add("Uniqlo");
		brands.add("Adidas");
		brands.add("H&M");
		
		System.out.println(brands.size());
		System.out.println(brands);
		
		// how to verify if element is there
		boolean isThere = brands.contains("Nike");
		System.out.println(isThere);
		
		
		// how to access element from Set collection
		// brands.get is not available to objects of Set type 
		
		Iterator<String> brand = brands.iterator();
		String obj = brand.next();
		System.out.println(obj);
		
		obj = brand.next();
		System.out.println(obj);
		
		System.out.println("---------------Get the next elements---------------------");
		while (brand.hasNext()) {
			obj = brand.next();
			System.out.println(obj);
		}
		
		
		System.out.println("------------------New Iterator object to get entire collection------------------");
		// if we need to iterate over entire collection again we need NEW ITERATOR OBJECT
		
		Iterator<String> brandIt = brands.iterator();
		while(brandIt.hasNext()) {
			System.out.println(brandIt.next());
		}
		
		// is there other way to get all elements from Set collection
		System.out.println("--------------Using enhanced loop for Set collection---------------");
		for(String it : brands) {
			System.out.println(it);
		}
		
		System.out.println("--------------LinkedHashSet---------------");
		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("LV");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		
		System.out.println(luxBrand.size());
		System.out.println(luxBrand);
		
		
		
		
		System.out.println("--------------TreeSet---------------");
		
		TreeSet<String> allBrands = new TreeSet<>(brands);
		allBrands.add("Calvin Klein");
		allBrands.addAll(luxBrand);
		
		System.out.println(allBrands);
		
		System.out.println("-----------Retrieving elements from TreeSet-------------");
		Iterator<String> ite = allBrands.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("--------------Creating an object of TreeSet to store Double----------------");
		
		Set<Double> tset = new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(1000.99);
		tset.add(10.01);
		tset.add(110.99);
		
		System.out.println(tset);
		
		
		
		
		
	}

}
