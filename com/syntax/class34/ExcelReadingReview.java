package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingReview {
	
	public static void main(String[] args) throws IOException {
		
String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlPath);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row2 = sheet.getRow(1);
		
		String cellValue = sheet.getRow(1).getCell(3).toString();
		
		System.out.println(cellValue);
		
		// how to get values from all rows and all columns?
		
		//1. get number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		//2. get number of columns
		int column = sheet.getRow(0).getLastCellNum();
		
		//3. use nested for loop to iterate over rows and columns
		for (int r = 0; r < rows; r++) { // iterates over rows
			for(int c = 0; c<column; c++) { // iterates over column
				String value = sheet.getRow(r).getCell(c).toString();
				System.out.print(value + " ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
