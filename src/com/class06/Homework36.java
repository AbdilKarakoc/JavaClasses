package com.class06;

import java.util.Scanner;

public class Homework36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*For you to do:
Prompt user to input two strings : "Please enter two strings"and two integers: 
"Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

Example input/output:
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND

word1: banana 
word2: apple 
int1: 2 
int2: 2 
Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE	
*/
		
		int num1;
		int num2;
		String name1;
		String name2;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two strings");
		name1=input.nextLine();
		System.out.println("Please enter two strings");
		name2=input.nextLine();
		
		System.out.println("Please enter two number");
		num1=input.nextInt();
		System.out.println("Please enter two number");
		num2=input.nextInt();
		
		if(num1==num2 && name1.equals(name2)) {
			System.out.println("AND");
			
		}
		else if(num1==num2 ||name1.equals(name2)) {
		System.out.println("OR");
		}
		else if (num1!=num2 && !name1.equals(name2)) {
			System.out.println("NONE");
			
		}		
		
}
}

