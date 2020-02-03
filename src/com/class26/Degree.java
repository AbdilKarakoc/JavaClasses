package com.class26;

public class Degree {
	public void getDegree() {
		System.out.println("I got a dregree");
	}
}

class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class PostGraduate extends Degree {
	public void getDegree() {
		System.out.println("I am Postgraduate");
	}
}
