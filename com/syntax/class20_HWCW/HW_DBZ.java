package com.syntax.class20_HWCW;

public class HW_DBZ {
//	Write a program  that will have 4 different access levels of constructors 
//	create 3 objects of this class: 
//	1 - inside same class;
//	2 - from outside the class; 
//	3 - from different class inside different package  
//	observe result.

	String name;
	int numberOfKids;
	String wife;
	String job;

	public void display() {
		System.out.println("His name is " + name + " is married to " + wife + " and has " + numberOfKids + " kids"
				+ " and occupation is " + job);
	}

	HW_DBZ(String character, String spouse, int numOfKids) {
		name = character;
		wife = spouse;
		numberOfKids = numOfKids;
	}

	
	public HW_DBZ(String character, String spouse, int numOfKids, String occupation ) {
		name = character;
		wife = spouse;
		numberOfKids = numOfKids;
		job = occupation;
	}
	
	protected HW_DBZ(String spouse, int numOfKids) {
		wife = spouse;
		numberOfKids = numOfKids;
		
	}
	
	private HW_DBZ(String character, String occupation ) {
	name = character;
	job = occupation;
		
	}

	public static void main(String[] args) {
		HW_DBZ dbz = new HW_DBZ("Goku", "Chi Chi", 2);
		dbz.display();
		HW_DBZ dbz1 = new HW_DBZ("Gohan", "Videl", 1, "Scholar");
		dbz1.display();
		HW_DBZ dbz2 = new HW_DBZ("Bulma", 2);
		dbz2.display();
		HW_DBZ dbz3 = new HW_DBZ("Vegeta", "Training");
		dbz3.display();
	}
	
	
	
	
}
