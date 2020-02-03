package com.classManupulation;

public class Manupulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		System.out.println(str.length());
		System.out.println("***************");
		System.out.println(str.toLowerCase());
		System.out.println("******************");
		System.out.println(str.toUpperCase());
		System.out.println("*******************");
		System.out.println(str.equalsIgnoreCase("hello"));
		System.out.println("********************");
		System.out.println(str.contains("ll"));
		System.out.println("**********************");
		System.out.println(str.startsWith("H"));
		System.out.println("**********************");
		System.out.println(str.startsWith("ll",2)); //index after two,
		System.out.println("************************");
		System.out.println(str.endsWith("AA"));
		System.out.println("***********************");
		System.out.println("Empty:"+str.isEmpty());
		System.out.println(str.concat (" ").concat(str));
		System.out.println("***********************");
		System.out.println(str.trim());
		System.out.println("***********************");
		System.out.println(str.charAt(3));
		System.out.println("***********************");
		System.out.println(str.charAt(0)+str.charAt(1)+str.charAt(3));	
		System.out.println("***********************");	
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf(1));
		System.out.println(str.equals(str));
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));
		
		
		//.equals:degerlerin toplamina bakar ve dogru olup olmadigina bakar :ex=str1.equals(str2) bye=bye
		//==: objectlerin ayni olup olmdigina bakar ex str1==str2= false value;
		
		
		
	}
}