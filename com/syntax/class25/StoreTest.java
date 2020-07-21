package com.syntax.class25;

public class StoreTest {
	public static void main(String[] args) {
		
		Store m = new Macys("Macys","Tysons, Virginia");
		Store s = new Starbucks("Starbucks", "New York");
		Store n = new Nike("Nike", "Los Angeles");
		
		Store[] myStore = {m,s,n};
		
		Store[] store ={new Macys("Macys","Florida"), new Starbucks("Starbucks", "Texas"),
				new Nike("Nike", "Illinois")};
		
		
		int size = store.length;
		System.out.println(size);
		
		
		for (Store t :store) {
			t.openHours();
			t.sell();
			System.out.println("------------------");
		}
		
		
		System.out.println("-------Looping  myStore array---------");
		
		for (int i = 0; i < myStore.length; i++) {
			myStore[i].openHours();
			System.out.println("-----------------");
		}
		
	}

}
