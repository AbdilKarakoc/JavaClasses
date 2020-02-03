package com.class06;

import java.util.Scanner;

public class Homework38 {

	
	
	/*Prompt user with a question: "Is it weekend?"
	If it is not a weekend --> subject="Manual testing"
	Otherwise --> subject="Java"

	Output: 
	"Today you will be learning ____"

*/
		public static void main(String[] args) {
			 

		
			Scanner input=new Scanner(System.in);
			System.out.println("Is it weekend?");
			boolean name=input.nextBoolean();
			
			
			if(name) {
				System.out.println("Today you will be learning Manual testing");
				
			
			}else{
				
				System.out.println("Today you will be learning  Java");
				
				
			}
		
	}

}
