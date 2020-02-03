package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		int num=10;
		//Autoboxxing --->converting primitive type into an Object type
		Integer integer=1000;
		System.out.println(integer.MIN_VALUE);
		String str=integer.toString();
		System.out.println(str);
		
		//coverting boolean primitive type into Boolean Object type
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		//Autoboxing --->converting Object type intoa primitove type
		int num1=new Integer(10);
		System.out.println(num1);
	}
}
