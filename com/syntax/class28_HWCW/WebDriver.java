package com.syntax.class28_HWCW;

interface WebDriver {
	
	void open();
	void close();
	String getTitle();

}

interface RemoteWebDriver extends WebDriver{
	
	void navigate();
	
}

interface TakeScreenShot {
	void getScreenShot();
	
}

class ChromeDriver implements WebDriver,RemoteWebDriver, TakeScreenShot{

	@Override
	public void navigate() {
		System.out.println("naviagtes to any website of your choice");
		
	}

	@Override
	public void open() {
		System.out.println("ChromeDriver Open Google chrome");
		
	}

	@Override
	public void close() {
		System.out.println("ChromeDriver Closes Google chrome");
		
	}

	@Override
	public String getTitle() {
		
		return null;
	}

	@Override
	public void getScreenShot() {
		System.out.println("takes screenshot from Chrome");
		
	}
	
}

class FireFoxDriver implements WebDriver,RemoteWebDriver, TakeScreenShot{

	@Override
	public void navigate() {
		System.out.println("naviagtes to any website of your choice");
		
	}

	@Override
	public void open() {
		System.out.println("FireFoxDriver Opens Firefox");
		
	}

	@Override
	public void close() {
		System.out.println("FireFoxDriver Closes Frirefox");
		
	}

	@Override
	public String getTitle() {
		
		return null;
	}

	@Override
	public void getScreenShot() {
		System.out.println("takes screenshot from Firefox");
		
	}
	
}

class SafariDriver implements WebDriver,RemoteWebDriver, TakeScreenShot{

	@Override
	public void navigate() {
		System.out.println("naviagtes to any website of your choice");
		
	}

	@Override
	public void open() {
		System.out.println("SafariDriver Opens Safari");
		
	}

	@Override
	public void close() {
		System.out.println("SafariDriver Closes Safari");
		
	}

	@Override
	public String getTitle() {
		
		return null;
	}

	@Override
	public void getScreenShot() {
		System.out.println("takes screenshot from Safari");
		
	}
	
}



