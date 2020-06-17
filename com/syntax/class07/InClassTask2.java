package com.syntax.class07;

public class InClassTask2 {
	public static void main(String[] args) {
		// create a boolean variable workDay and assign true 
		//create int variable day and assign it to 1
		// as long as it is workDay print "I need a day off" and increase day
		// Once day is 6 print "I do not need a day off any more"
		
		 boolean workDay = true;
		 int day = 1; 
	
		while (workDay) {
			if (day < 6 ) {
			System.out.println("I need a day off");
				}else {
				System.out.println("I do not need a day off any more");
				workDay = false;
			}
			day++;
		
		} 
			
//		System.out.println("------------2nd way-------------");
//		
//		
//		 boolean workDay = true;
//		 int day = 1; 
//	
//		while (workDay && day <= 6) {
//			if (day < 6 ) {
//			System.out.println("I need a day off");
//				}else {
//				System.out.println("I do not need a day off any more");
//				
//			}
//			day++;
//		
//		} 
		
		
		
	}

}
