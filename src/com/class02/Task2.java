package com.class02;

public class Task2 {

	
	//K2 
	//Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say.
	//“The _______ of 2 numbers ___ and ___ is equal to _____”
	//Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ “
	//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say.
	//“The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
	
	
	public static void main(String[] args) {
		
		
	double num1=11.45;
	double num2= 13.43;
	
	double sum=num1+num2;
	double sub=num1-num2;
	double mult=num1*num2;
	double div=num1/num2;
	
		System.out.println("The addition of 2 numbers num1 and num2 is equal to "+sum);	
		System.out.println("The subraction of 2 numbes num1 and num2 is equal to " +sub);
		System.out.println("The multivication of 2 numbers num1 and num2 is equal to "+mult);	
		System.out.println("The divition of 2 numbes num1 and num2 is equal to " +div);
			
		
		double num3=3.9;
		double num4=3.9;
		
		double squ= num3*num4;
		
		System.out.println("The square of the num3 and nu4 is "+squ);
		
		
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=(width+width+height+height);
		
		
		
		System.out.println("The perimeter of a rectangle with witdth 5 and height 8 is equal to " + perimeter +  " and the area is " +area);
		
		
		
		
		
		
	}
	
	
}
