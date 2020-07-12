package com.syntax.class21;

public class Book_task {
	// Write program as a Book class that will have instance variables and 2 Constructors. 
	// While creating an object make sure:
	// Instance variables are being initialized
	// Both Constructors are being executed
	
	
	
	String name;
	String coverType;
	int pages;
	boolean pictureBook;
	
	public Book_task(String name, int pages, String coverType, boolean pictureBook) {
		this.name =  name;
		this.pages = pages;
		this.coverType = coverType;
		this.pictureBook = pictureBook;
		
	}
	
	public Book_task(String name, int pages, boolean pictureBook) {
		this.name =  name;
		this.pages = pages;
		this.pictureBook = pictureBook;
	}
	
	public void display() {
		System.out.println("The books name is " + name + " it has " + pages+ " pages"
							+ " it's a " + coverType + " book and it contains colored pictures = "
							+ pictureBook);
	}
	
	public static void main(String[] args) {
		Book_task obj = new Book_task("Captiain UnderPants", 150, "paperback", true);
		obj.display();
		
		Book_task obj1 = new Book_task("Harry Potter", 550, false);
		obj1.display();
		
	}
	
}
