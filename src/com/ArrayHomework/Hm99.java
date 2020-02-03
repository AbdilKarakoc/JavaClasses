package com.ArrayHomework;

import java.util.Scanner;

public class Hm99 {
	public  static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		 String  browser;
		 System.out.println("Enter the browser name to proceed further with execution");
		    browser = sc.nextLine();
		    browser=browser.toLowerCase();
		  if(browser.equalsIgnoreCase("ChroME"))
		       {
		           System.out.println("Proceed with Chrome browser");
		       }
		       else if(browser.equalsIgnoreCase("FireFOx"))
		       {
		           System.out.println("Proceed with Firefox browser");
		       }
		         else if(browser.equalsIgnoreCase("Ie"))
		       {
		           System.out.println("Proceed with IE browser");
		       }
		       else
		       {
		           System.out.println("Invalid browser");
		       }

		
	}
}