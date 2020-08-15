package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	
	// write into existing file
	public static void main(String[] args) throws IOException {

		String file = "coding/Example.properties";

		FileInputStream fis = new FileInputStream(file);

		Properties p= new Properties();
		p.load(fis);
		
		p.setProperty("street","Black Water ln");
		
		// specifying path for different file
		String newFile = "coding/NewFile.properties";
		
		// if file is not there it will be created
		FileOutputStream fos = new FileOutputStream(newFile); 
		
		p.store(fos, "Added Additional Key");
		
		

	}

}
