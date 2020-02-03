package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj=new ChromeDriver();
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindow();
		obj.openBrowser();
		
		WebDriver obj1=new FirefoxDriver();
		obj1.closeBrowser();
		obj1.findElement();
		obj1.maximizeWindow();
		obj1.openBrowser();
	}

}
