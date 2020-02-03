package com.class24;

public class Constructor {

	void Constructor() {
		
		System.out.println("Hello");
	}
	
	Constructor() {
		System.out.println("I am a Constructor");
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		obj.Constructor();
		
	}

}

//Constructor() VS method():
//1:Constructor do not have aby return type even with void while method can have any return type.
//2:Constructor must be same name as a class, while method can have any name
//3:Constructors Cannot use any non access modifiers, while method can (static, final, abstract)
//4;Constructor call happen automatically when object instance of the clss is getting created, while method me be called
//5:Constructor initializes the objest, while method perform some specific functionalitoes, by using method we describe behavior of the object.

//SIMILARITIES

//-BOTH CAN HAVE OR DO NOT HAVE PARAMETERS
//BOTHS CAN USE ACCESS MODIFIERS