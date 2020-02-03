package com.class06;

import java.util.Scanner;

public class Homework37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*"Are you thirsty?"
		"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

Output:
"Looks like you need ___ "
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean name =input.nextBoolean();
		
		System.out.println("Are you sleepy?");
	
		boolean name1=input.nextBoolean();
		
		if(name &&!name1) {
			System.out.println("Looks like you need Water");
		
		}else if(name &&name1) {
			System.out.println("Looks like you need Coffee");
		}else if(!name &&name1) {
			
			System.out.println("Looks like you need Tea");
				
			}else {
				System.out.println("Looks like you need to drink Nothing");
			}
		
	}
	}

