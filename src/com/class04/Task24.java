package com.class04;

import java.util.Scanner;

public class Task24 {

	
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
			
		System.out.println("Enter your name");
		
		String name=input.nextLine();
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		System.out.println("Enter your mobile number");
		
		double phone=input.nextDouble();
		
		
		System.out.println("Your name is "+name + "your age " +age + "and your mobile number is "+phone);
	}
	
	}



