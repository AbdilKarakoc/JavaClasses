package com.syntax;

public class NesteiIfSmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program with one int value for salary 
		//and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise 
		//you should buy a used car. For those you can afford a new car there are 
		//different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read
		//"Save up money and wait until next year"

		int salary = 50000;
		String cars;
		
		if (salary<=60000) {
			
			System.out.println("Save up money and wait until next year");
			
			if(salary>=50000) {
			System.out.println("You may buy a brand new car");
		}else if(salary>=70000) {
			System.out.println("You may buy Audi A5 ");	
			
		}else if(salary>=80000) {
			System.out.println("You may buy Audi Mercedes-Benz");	
			
		}else if(salary>=90000) {
			System.out.println("You may buy Audi Jaguar");	
			
		}else if(salary>=100000) {
			System.out.println("You may buy Audi Tesla");	
			
		
			}
		}



	}

}
