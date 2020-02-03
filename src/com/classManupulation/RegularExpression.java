package com.classManupulation;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="1234Hel45645lo4565456";
		System.out.println(str.replaceAll("[0-9]", "")); // ONLY TEXT
		System.out.println(str.replaceAll("[a-zA-Z]", ""));//ONLY NUMBERS
		System.out.println(str.replaceAll("[^0-9]", ""));//ONLY NUMBERS
		
		String str2="Hi#$%How#$%4356346";
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		
		String str3="12-22-1990";
		System.out.println(str3.replace("-", "/"));
		
		System.out.println("***************************");
		
		String str6="Today is our java class";
		System.out.println(str6.replace(" ", ""));
		System.out.println(str6.replaceAll("\\s", ""));
	}
	
}
