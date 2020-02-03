package com.class05;

public class LogicalExcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 â?’ output â€?It is a weekdayâ€?,
		//anyday from 6-7 â?’ output â€?It is a weekendâ€?,
		//any other day â?’ output â€?Invalid dayâ€?
	
		int day=7;
	
		
	if (day>=1 && day<=5) {
	System.out .println("It is weekday");
	
	}else if(day>=6 && day<=7){
	System.out .println("It is weekends");
	
	}else {
		System.out .println("Invalid day");
	
	}
}

}