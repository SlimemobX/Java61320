package com.syntax.class25;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening browser");
	}


}

class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening firefox browser");
	}
	
}

class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening Chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening Internet Explorer browser");
	}
}
