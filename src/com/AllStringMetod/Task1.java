package com.AllStringMetod;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your class day::");
		String day=input.nextLine();
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java class");
			}else if(day.equals("Sunday")) {
				System.out.println("Sunday is your Git class");	
			}else if(day.equals("Tuesday")) {
				System.out.println("Tuesday is your SDLC class");	
			}else if(day.equals("Thursday")) {
				System.out.println("Thursday is your Manual Testing class");	
			}else {
					System.out.println("Invalid day");	
					
	}

}
}
		
