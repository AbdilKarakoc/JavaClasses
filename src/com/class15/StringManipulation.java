package com.class15;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String class comes in JAVA LANG PACKAGE
		//2 ways to create a String
		//first way using String literal
		String str="Hello";
		//second way using keword-creating a String object
		String str1=new String("hello");
		System.out.println(str1);
		System.out.println(str);
		
		//inside String class we have many methods that can be performed on Strings:
		//1.find the number of characters inside the String
		
		int length=str.length();
		System.out.println(length);
		System.out.println(str.toLowerCase());
		System.out.println(str);
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		//String myString1=null;
		//System.out.println(myString1.isEmpty());
		
		String a="Good evening students";
		boolean exist=a.contains("students");
		System.out.println(exist);
		
	}

}
