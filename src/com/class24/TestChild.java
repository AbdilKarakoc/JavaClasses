package com.class24;

public class TestChild {

	public static void main(String[] args) {
		Child child1=new Child();
		System.out.println(Child.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		
		System.out.println("*******************************");
		Parents parent=new Parents();
		System.out.println(Parents.race);
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sing();
		//parent.code(); because parents cant get child abilities
		
		System.out.println("*******************************");
	
		Child2 child2=new Child2();
		System.out.println(Child2.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.sing();
		//child2.code(); because child 2 cant get from child1 class.
		child2.playFootball();
	}

}


