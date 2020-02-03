package com.class30;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
 class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver ********");	
	}
	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver ***********");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver ******************");
	}
	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver ***********************");
	} 
 }
 class FirefoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver is good");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver is good");
	}
	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver is good");
	}
	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver is good");
	}
 }