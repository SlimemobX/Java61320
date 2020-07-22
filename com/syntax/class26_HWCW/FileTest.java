package com.syntax.class26_HWCW;

public class FileTest {

	public static void main(String[] args) {
		System.out.println("------------- .java -------------");
		File java = new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		System.out.println("------------ .doc ------------");
		
		File word = new WordFile();
		word.open();
		word.edit();
		word.close();
		
		System.out.println("--------------- .pdf --------------");
		
		File pdf = new PdfFile();
		pdf.open();
		pdf.edit();
		pdf.close();
		
		
	}
}
