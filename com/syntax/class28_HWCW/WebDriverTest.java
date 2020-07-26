package com.syntax.class28_HWCW;

public class WebDriverTest {
	public static void main(String[] args) {
		
		System.out.println("----------ChromeDriver------------");
		
		ChromeDriver cd = new ChromeDriver();
		cd.navigate();
		cd.open();
		cd.close();
		cd.getTitle();
		cd.getScreenShot();
		
		
		System.out.println("----------FireFoxDriver------------");
		
		FireFoxDriver ff = new FireFoxDriver();
		ff.navigate();
		ff.open();
		ff.close();
		ff.getTitle();
		ff.getScreenShot();
		
		System.out.println("----------SafariDriver------------");
		
		SafariDriver sd = new SafariDriver();
		sd.navigate();
		sd.open();
		sd.close();
		sd.getTitle();
		sd.getScreenShot();
		
		
	
		
		
	}

}
