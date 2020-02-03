package com.class17;

public class Main1 {
	String breed;
	String name;
	String color;
	
	void bark() {
	}
	
	void run() {
	}
	void play() {
	}
	
	
	public static void main(String[] args) {
		
		Main1 dog1=new Main1();
		dog1.breed="Husky";
		dog1.bark();
		dog1.run();
		dog1.play();
		System.out.println(dog1.breed+ " can bark");
		System.out.println(dog1.breed+ " can run");
		System.out.println(dog1.breed+ " can play");
		Main1 dog2=new Main1();
		dog2.breed="Bulldog";
		dog2.bark();
		dog2.run();
		dog2.play();
		System.out.println(dog2.breed+ " can bark");
		System.out.println(dog2.breed+ " can run");
		System.out.println(dog2.breed+ " can play");
		
		Main1 dog3=new Main1();
		dog3.breed="Labrador";
		dog3.bark();
		dog3.run();
		dog3.play();
		System.out.println(dog3.breed+ " can bark");
		System.out.println(dog3.breed+ " can run");
		System.out.println(dog3.breed+ " can play");
		
		
		
		
	}
	
	
}
