package com.class05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ask user to enter age
		//if age is from 1 to3 -->you are baby
		//if age from 3-5--. you are a toddler
		//if age from 5-12--. you are kid
		//if age from 12-19--->teenager
		//if age 20---> you are an adult.
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=input.nextInt();
				
		if(age>=1 && age<=3) {
		System.out.println("You are a baby");
		
		}else if(age>3 && age<=5) {
			System.out.println("You are a toddler");
			
		}else if(age>5 && age<=12) {
			System.out.println("You are a kid");
		
		}else if(age>=12 && age<=19) {
			System.out.println("You are a teanager");
	
		}else {
			System.out.println("You are an adult");
		}
	
	
		
				
		
	}

}
