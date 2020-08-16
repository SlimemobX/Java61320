package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap{
	
	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlPath);
		
		// create an object of Workbook
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		// get numbers of rows and columns
		int rows = sheet.getPhysicalNumberOfRows();
		
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		// create empty list
		List<Map<String,String>> xlList = new ArrayList<>();
		
		// loop over rows
		for (int r =1; r < rows; r++) {
			// for every row create a new map
			Map<String,String> map =new LinkedHashMap<>();
			// loop over every column
			for (int c = 0; c < col; c++) {
				// get keys from 1 row (header)
				String key = sheet.getRow(0).getCell(c).toString();
				// get values from other rows
				String value = sheet.getRow(r).getCell(c).toString();
				
				map.put(key, value);
				
				
			}
			// add created map with values into List
			xlList.add(map);
		}
		
		System.out.println(xlList);
		
		
	}

}
