package com.class15;

import java.util.Scanner;

public class StringManiTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the browser name");
		String browser=scan.nextLine();
	
		switch(browser.toLowerCase()) {
		case"firefox":
		System.out.println("Execution be prformed on " +browser);
		break;
		case"chorome":
			System.out.println("Execution be prformed on " +browser);
			break;
		case"ie":
			System.out.println("Execution be prformed on " +browser);
			break;
		case"safarii":
			System.out.println("Execution be prformed on " +browser);
			break;
		default:
				System.out.println("Please enter valid browser");
		}
		
	}

}
