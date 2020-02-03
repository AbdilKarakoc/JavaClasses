package com.class04;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=10;
	//	int b=12;
		
		//String name1="jon";
		//String name2="abdil";
		//System.out.println(name1.contentEquals(name2));
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter in First number:");
		int num1=scan.nextInt();
		
		System.out.print("Enter on Operator" );
		String operator=scan.next();
		
		System.out.print("Enter in Second number:");
		int num2=scan.nextInt();

		
		if(operator.equals("+")) {
			System.out.print(num1+num2);
			
		}else if(operator.equals("-")) {
		System.out.print(num1-num2);
		

		}else if(operator.equals("/")) {
		
		System.out.print(num1/num2);
	
		} else if(operator.equals("*")) {
			System.out.print(num1 * num2);
			
		}else {
			
		System.out.print("Invalid Operator or number entered");
			
		
		}
	}
}

