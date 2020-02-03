package com.class18;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello " + name);

	}

	// create a method that will say hello in different language based
	// on the value that will be passed when user calls a method

	void sayHelloDiffirentLanguage(String country) {

		switch (country) {

		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("Hola");
			break;
		default:
			System.out.println("I dont know how to say Hello in your language");
		}
	}

	// method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is " + name + "and I am " + age + "years old");

	}

	void isSnowing(boolean isSnowing) {
		if (isSnowing) {
			System.out.println("Stay Home");

		} else {
			System.out.println("Go for a walk");
		}
	}
}
