package com.class04;

import java.util.Scanner;

public class TaskLaon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner phone=new Scanner (System.in);
		
		System.out.println("What is the amount of laon");
		int laon=phone.nextInt();
		
		if (laon>200.00) {
		System.out.println("I will lend the money");	
		}else { 
			System.out.println("I would reject the client");
			
		}
	}

}
