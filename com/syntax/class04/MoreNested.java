package com.syntax.class04;

public class MoreNested {
	public static void main(String[] args) {
		
		// Let's have a date of month and a day week 
		// if it is Friday ---> we are going to watch a movie
		//						if date is 13 ---> watch a scary movie
		//							if date is not 13 ---> watch a comedy
		// if it is not Friday ----> we are going to study JAVA
		
		boolean isFriday = true;
		int date = 17;
		
		if (isFriday) {
			System.out.println("We are going to watch a movie");
			
			if (date == 13) {
				System.out.println("We are going to watch a SCARY movie");
			}else {
				System.out.println("We will watch a COMEDY");
			}
		}else {
			System.out.println("we will study for JAVA");
		}
	
		
	}

}
