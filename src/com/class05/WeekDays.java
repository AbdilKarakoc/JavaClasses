package com.class05;

public class WeekDays {

	public static void main(String [] args )  {
		
		
		
		String weekday="Monday";
		
		if (weekday.equals("Tuesday") || weekday.equals("Thursday")) {
			System.out.println("SDLC Class");
			
		}else if(weekday.equals("Saturday") || weekday.equals("Sunday")) {
			
			System.out.println("Java Class");
		
		}else if(weekday.equals("Monday") || weekday.equals("Friday")) {
			
			System.out.println("No Class");
		}else if(weekday.equals("Wednesday")) {
		
		}else {
			System.out.println("Not Valid Class");
			
			
			}
			
		}
	
}
