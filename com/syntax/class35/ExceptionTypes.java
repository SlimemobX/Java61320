package com.syntax.class35;

import java.io.FileInputStream;

public class ExceptionTypes {
	
	public static void main(String[] args) {
		
		// checked exception are the E that checked by the compiler
		// Thread.sleep(2000);
		
		String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		// FileInputStream fis = new FileInputStream(xlPath); // if file is not there object of FileNotFoundException
		
		// unckecked E - are that not ckecked by the compiler
		
		int a =12;
		int b = 0;
		
		// System.out.println(a/b); // ArithmeticException
		
		String str = null;
		System.out.println(str.length()); // NullPointerException
		
		
		
	}

}
