package com.syntax.class33_HWCW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FaceBookPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		
//		Create a property file to store following configurations:
//			browser=chrome
//			url=https://facebook.com
//			username
//			password
		
		
		String filePath = "coding/FaceBook.properties";
		
		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(file);
		
		String value1 = prop.getProperty("browser");
		System.out.println(value1);
		
		String value2 = prop.getProperty("url");
		System.out.println(value2);
		
		String value3 = prop.getProperty("username");
		System.out.println(value3);
		
		String value4 = prop.getProperty("password");
		System.out.println(value4);
		
		
	}

}
