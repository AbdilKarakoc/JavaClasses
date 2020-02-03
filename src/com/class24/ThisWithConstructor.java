package com.class24;

public class ThisWithConstructor {
	
	
	ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str) {
		this();//used to call current class constructor
		System.out.println("I am constroctor with 1 string parameter");
	System.out.println("********************************************************************");
	}

	ThisWithConstructor(String str,String str1) {
		this("Hello");
		System.out.println("I am a constructor with 2 params");
		
	}
	
	
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		//can we execute 2 constructors when creating an object
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
		
		
	}
}
