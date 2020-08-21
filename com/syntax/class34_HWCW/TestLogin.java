package com.syntax.class34_HWCW;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws IOException, InterruptedException {

//		Test Login functionality with 5 different usernames:
//
//		Using Automation Code:
//
//		Login to the application using Data from XL File
//		Verify welcome message displays correct user that logged in
//
//		Precondition:
//		Manually Create 5 different username and passwords and Store data inside XLFile
//		URL=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
//		username: Admin
//		password: Hum@nhrm123

		String xlPath = System.getProperty("user.dir") + "/testdata/TestLogin.xlsx";

		FileInputStream fis = new FileInputStream(xlPath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlList = new ArrayList<>();

		for (int r = 1; r < rows; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < col; c++) {

				String key = sheet.getRow(r).getCell(0).toString();
				String value = sheet.getRow(r).getCell(c).toString();

				map.put(key, value);

			}

			xlList.add(map);
		}
		for(Map<String,String> maps: xlList) {
			System.out.println(maps);
		}

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		for (Map<String, String> map : xlList) {
			Set<String> user1 = map.keySet();
			for (String user2 : user1) {
				String password = map.get(user2);
				WebElement username = driver.findElement(By.id("txtUsername"));
				WebElement pass = driver.findElement(By.id("txtPassword"));
				username.sendKeys(user2);
				pass.sendKeys(password);
				Thread.sleep(2000);
				WebElement logIn = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
				logIn.click();
				Thread.sleep(2000);

				WebElement welcome = driver.findElement(By.cssSelector("a[id = 'welcome']"));
				Thread.sleep(2000);
				String wcText = welcome.getText();
				System.out.println(wcText);
				Thread.sleep(2000);
				welcome.click();
				
				WebElement logout = driver.findElement(By.xpath("//a[text()= 'Logout']"));
				Thread.sleep(2000);
				logout.click();

			}
		}

	}

}
