package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		///Users/irwinferrufino/eclipse-workspace/JavaBasics/coding/Example.properties
		//1. Identify path to the file you would like to read
		String filePath ="coding/Example.properties";
		
		
		//2. create an object of FileInputStream class
		
		FileInputStream file = new FileInputStream(filePath);
		
		
		//3. to work with property file we use Properties class Java
		Properties prop = new Properties();
		prop.load(file);
		
		String value1 = prop.getProperty("username");
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);
		
		String value3 = prop.getProperty("password");
		System.out.println(value3);
		
		String value4 = prop.getProperty("address");
		System.out.println(value4);
		
		String value5 = prop.getProperty("company");
		System.out.println(value5);
		
		
	}

}
