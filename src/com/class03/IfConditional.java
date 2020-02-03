package com.class03;

public class IfConditional {

	
	public static void main(String [] args) {
		
		
		
		
		int a=90;
		int b=300;
		//if number a is bigger than number b
		//I want to print a is bigger than b
		
	 if(a>b) {
		 
		 System.out.println("a is larger than b");
	 }else {  
		 System.out.println("a is smaller than b");
		 
		 
		 int expectedHours=15;
		 int actualHours=2;
		 
		 if(actualHours>expectedHours) {
		 System.out.println( " you will succeed");
		 
		}else {
			System.out.println( "please study more");
			
		}

		 double teaPrice= 4.99;
		 double allowedPrice=5.99;
		 //teaPrice-=2;
		 
		 // if price is more than i can afford i will not buy
		 //if price is less or matches what i can afford then i will buy tea
		 
		 if( allowedPrice>=teaPrice) {
			 
			 System.out.println("I will buy tea");
			 
			 System.out.println("And I will enjoy my tea");
			 
		 }else {
			 System.out.println("I cant afford, I need to stduy more");
			 System.out.println("I will go back to study");
			 
		 }
		 System.out.println("I keep writing some code");
		 System.out.println("I keep writing some more code");
		 
	 }
	}
}


