package com.class32;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person obj=new Person();
		System.out.println(obj.getfirstname("John"));
		System.out.println(obj.getlastname("Doe"));
		System.out.println(obj.getbirthmonth("10/25/1900"));
		System.out.println(obj.getssn("123-45-6789"));
}
}
