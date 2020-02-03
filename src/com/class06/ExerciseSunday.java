package com.class06;

import java.util.Scanner;

public class ExerciseSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*ask user to enter the mont they were born
		 * based on the month define the season
		 * if user is born in Janu, Feb,Dec--->winter
		 * if march,april,may--->spring
		 * if jun,july,aug--->summer
		 * if september,oct,november --->fall
		 * otherwise--->unknown
		 * at the end of program
		 * "You were bornin...."
		
		 * 
		 */
		
		String month;
		String season;
		
		Scanner abdil=new Scanner(System.in);
		System.out.println("Please enter the month you born");
		
		month=abdil.nextLine();
		
		
		if(month.equals("January")||month.equals("February")||month.equals("December")) {
			
			season="winter";
		
		
		}else if (month.equals("March")||month.equals("April")||month.equals("May")) {
				
				season="Spring";
	
				
		}else if (month.equals("June")||month.equals("July")||month.equals("August"))  {
					
					season="Summer";
				
		}else if(month.equals("September")||month.equals("October")||month.equals("November")) {
			
			season="fall";
		
		}else {
			season="unknow";
			
		}
		
		System.out.println("You were in " +month);
		System.out.println(season);
		
	}

}
