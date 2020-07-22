package com.syntax.class26_HWCW;

public abstract class File {
//	Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method 
//	while open is an abstract. 
//	Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: 
//	Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
	
	void edit() {
		System.out.println("Allows you to make revisions");
	}
	
	void close() {
		System.out.println("Allows you to exit out of page");
	}
	
	public abstract void open();
	
	
}

class JavaFile extends File{

	
	public void open() {
		System.out.println("To open JavaFile we need sublime text or NotePad++");
		
	}
	
}

class WordFile extends File{

	
	public void open() {
		System.out.println("To open .doc files on mac you need Microsoft Word or open with pages");
		
	}
	
}

class PdfFile extends File{

	
	public void open() {
		System.out.println("To open .pdf files on a mac you need PDF Expert");
		
	}
	
}


