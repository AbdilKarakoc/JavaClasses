package com.class06;

import java.util.Scanner;

public class Homework40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program using the switch statement  
Let us consider the scenario regarding the born baby age 

First Output: "enter the age of the Child"

case 1: if age is 1 print as "You can Crawl"

case 2 : if age is 2 print as  "You can Talk"

case 3: If age is 3 print as "You can Dance"

case 4: if age is 4 print as "You can get  Trouble"

Other than this age (1-4) it should print "I don't know how old you are" 
*/
		
	int age;
	String scenario;
	System.out.println("enter the age of the Child");
	Scanner input=new Scanner(System.in);
	age=input.nextInt();
	
	
	switch(age) {
	
	case 1:
		scenario=("You can Crawl");
		break;
	case 2:
		scenario=("You can Talk");
		break;
	case 3:
		scenario=("You can Dance");
		break;
	case 4:
		scenario=("You can get  Trouble");
		break;
	default:
			scenario=("I don't know how old you are");
	}
System.out.println(scenario);
}
}