package com.class25_1;

public class CanWeOverLoad {
	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one"+str);
	}
	
	
	
	//can we overload a main method
	
	
	
	public static void main(String str) {
		System.out.println("I am a min method with String arguments");
	}
	
	public static void main(String str,String [] arg) {
		System.out.println("I am a min method with 2 parameters");
}
	
	public static void main(String  [] arg) {
		System.out.println("I am a min method with String array");
		CanWeOverLoad.main("String");
		String[] array= {"A", "B"};
		main("Hello", array);
		CanWeOverLoad a=new CanWeOverLoad();
		a.methodOne();
		a.methodOne();
}
}