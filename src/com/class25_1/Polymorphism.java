package com.class25_1;



public class Polymorphism {

	public void area(int num1,int num2) {
		System.out.println("The area of rectangle: "+ num1*num2);
	}
	
	public void area(int num1) {
		System.out.println("The area of square: " +num1*num1);
	}
	
	
	public void area(int num1,int num2,int num3) {
		System.out.println("The area of box:" +num1*num2*num3);
	}
	
	public static void main(String[] args) {
		Polymorphism a=new Polymorphism();
		a.area(2,3);
		a.area(2);
		a.area(2,3,4);
	}
}
	

