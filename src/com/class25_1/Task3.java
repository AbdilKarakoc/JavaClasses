package com.class25_1;

public class Task3 {

	private void name() {
		System.out.println("I am a private method one without parameter.");
	}
	private void name(String Str) {
		System.out.println("I am a private method one with String str.");
	}
	private void name(int a) {
		System.out.println("I am a private method one with int a.");
	}
	
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.name();
		obj.name("String str");
		obj.name("int a");
		
	}
	
	
	
}
	
	

