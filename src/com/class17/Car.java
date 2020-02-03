package com.class17;

public class Car {

	boolean bothEven(int num1, int num2) {
		  if(num1%2==0 && num2%2==0) {
		    return true;
		   
		  }else {
		    return false;
		  }
		}
		
		public static void main(String [] args) {
		  
		 Car b=new Car();
		 
		 System.out.println(b.bothEven(4,10));
		}
	}