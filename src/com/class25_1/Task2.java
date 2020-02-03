package com.class25_1;

public class Task2 {

	static void name() {
		System.out.println("I am a method one without parameter");
	}
	static void name(String Str) {
		System.out.println("I am a method one with String str");
	}
	static void name(int a) {
		System.out.println("I am a method one with int a");
	}
	
	
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		obj.name();
		obj.name("String str");
		obj.name("int a");
		
	}
	
	
	
}
