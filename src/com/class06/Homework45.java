package com.class06;

import java.util.Scanner;

public class Homework45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		   scan=new Scanner(System.in);
		   int num;
		   System.out.println("PLease enter a number");
		   num=scan.nextInt();
		   if(num%2==0){
		     System.out.println("Value is   even");
		     if(num > 100){
		       System.out.println("Value is too large");
		     }else{
		       System.out.println("Value is just right");
		     }
		   }else{
		     if(num > 100){
		       System.out.println("This is an odd number and value is too high");
		     }else{
		       System.out.println("Value is just right and is an odd number");
		     }
		   }	
		
		
		
		
	}

}
