package com.syntax.class35_HWCW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Hw {
//		Create a static method that will return a List of Exceptions.
//		Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//		Call your method inside main and print name and details of all Exception objects.
	
	public static List<String> exceptionList(){
		
		List<String> exceptions = new ArrayList<>();
		
		
		String xlPath = System.getProperty("user.dir") + "/SampleTestData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(xlPath);
		}catch (FileNotFoundException fne) {
			exceptions.add(fne.toString());
		}
		
		
		int a = 20;
		int b = 0;
		try { 
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			exceptions.add(ae.toString());
		}
		
		
		int[] array = { 15, 30,45};
		
		try {
			System.out.println(array[5]);
		}catch (ArrayIndexOutOfBoundsException aiob) {
			exceptions.add(aiob.toString());
		}
		
		
		
		String str = null;
		
		try {
		System.out.println(str.length()); 
		
		}catch (NullPointerException npe) {
			exceptions.add(npe.toString());
		}
		
		return exceptions;
	}
	
	
	public static void main(String[] args) {
		
		List<String> list = exceptionList();
		for (String exList: list) {
			System.out.println(exList);
		}
		
		
		
	}

}
