package com.class30;

interface Shape  {
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
	//Create 2 child classes: 
	//Circle & Square that should have an implementation of area and perimeter calculation. Test your code.
	
	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape{
	double pi=3.14;
	double radius=6;
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println(pi*radius*radius);
	}
	@Override
	public void calculatePerimiter() {
		// TODO Auto-generated method stub
		System.out.println(2*pi*radius);
	}
}
class Square implements Shape {

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimiter() {
		// TODO Auto-generated method stub
		
	}
	
}