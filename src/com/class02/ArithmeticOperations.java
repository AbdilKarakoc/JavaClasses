package com.class02;

public class ArithmeticOperations {
/*
 * declare 2 variables and initiaize them
 * display result of addition, subraction,multiplication abd division
 * 
 */
	
	public static void main(String[] args) {
		
		int num1,num2;
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println(num1+","+num2);
		
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		// the addition of 2 number is 
		
		System.out.println("The addition of 2 number is " +sum);
		System.out.println("The subraction of 2 number is " +sub);
		System.out.println("The multiplication of 2 number is  "+mult);
		System.out.println("The division of 2 number is " +div);
		
		
		
	}
	
}
