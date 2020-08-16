package com.syntax.class34_HWCW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	
	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir")+ "/testdata/UsernamePassword.xlsx";
		
		FileInputStream fis = new FileInputStream(xlPath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet  = book.getSheet("Sheet1");
		
		sheet.createRow(1).createCell(0).setCellValue("JakeRyan");
		sheet.getRow(1).createCell(1).setCellValue("Jake89724");
		
		sheet.createRow(2).createCell(0).setCellValue("LoganMiller");
		sheet.getRow(2).createCell(1).setCellValue("Logan9038");
		
		FileOutputStream fos = new FileOutputStream(xlPath);
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
		
		
		
		
		
	}

}
