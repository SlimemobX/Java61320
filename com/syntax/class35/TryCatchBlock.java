package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	public static void main(String[] args) {

		String xlPath = System.getProperty("user.dir") + "/SampleTestData.xlsx";

		try { // code that might throw an exception

			FileInputStream fis = new FileInputStream(xlPath);

		} catch (FileNotFoundException fne) { // catching right exception

			System.out.println("I caught the exception");
		}

		System.out.println("          ---------------------------          ");

		int[] array = { 10, 20,30 };

		try {
			
			System.out.println("I am a beginning of the try block");
			System.out.println(array[2]);
			System.out.println("I am a end of the try block");
			
		} catch (ArrayIndexOutOfBoundsException aiob) {
			
			System.out.println("I am a beginning of the catch block");
			System.out.println("I caught ArrayIndexOutOfBoundsException");
			System.out.println("I am a beginning of the catch block");
			
		}

		System.out.println("End of the code");

	}

}
