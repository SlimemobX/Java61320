package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {
	
	// writing data into existing file and writing into a new one

	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlPath);

		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(5).setCellValue("Result");
		
		sheet.getRow(1).createCell(5).setCellValue("Fail");
		
		sheet.getRow(2).createCell(5).setCellValue("Pass");
		
		sheet.getRow(3).createCell(5).setCellValue("Pass");
		
		sheet.createRow(4).createCell(0).setCellValue("We are done!!!");
		
		
		
		String newXl = System.getProperty("user.dir")+ "/testdata/Results.xlsx";
		
		FileOutputStream fos = new FileOutputStream(newXl);
		
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
		
		
		
		
		
	}

}
