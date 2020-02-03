package com.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Today is Sunday";
		String str1=str.replace(" ", "");
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println("*******************");
		
		
		String str2="abdbdbd12345#%$&*";
		System.out.println(str2.replaceAll("[^a-zA-Z]", ""));
		
		System.out.println("*******************");
		
		String str3="Is it Saturday?Is it raining?Do you have a Java Class today?";
		 String [] str4=str3.split("\\?");
	        System.out.println(str4.length);
	     
}
}
