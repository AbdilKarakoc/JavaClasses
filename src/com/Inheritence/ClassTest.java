package com.Inheritence;

public class ClassTest {


	public static void main(String[] args) {
		ClassC obj=new ClassC();
		System.out.println(ClassC.name);
		System.out.println(obj.size);
		System.out.println(obj.color);
		obj.sunny();

		System.out.println("***************************************");
		
		ClassB obj1=new ClassB();
		System.out.println(ClassB.name);
		System.out.println(obj1.size);
		System.out.println(obj1.color);
		obj1.clean();
		
		System.out.println("***************************************");
		
		ClassA obj2=new ClassA();
		System.out.println(ClassA.name);
		System.out.println(obj2.size);
		System.out.println(obj2.color);
		obj2.dirty();
	}

}
