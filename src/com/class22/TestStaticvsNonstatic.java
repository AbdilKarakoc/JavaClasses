package com.class22;

public class TestStaticvsNonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to access static members
		//they can be accessed by className
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		//how to access static members
		//they can be accessed by cretaing object
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();

}
}
