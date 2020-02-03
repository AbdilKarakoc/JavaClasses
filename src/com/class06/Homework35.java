package com.class06;

import java.util.Scanner;

public class Homework35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		   
		        
		        Scanner scan = new Scanner(System.in);
		          System.out.println("Do you need a loan?");
		          boolean loan=scan.nextBoolean();
		          
		          /*enter true or false for loan
		          * if no --> Unknown
		          * if yes--> check the credit score
		          * based on the score define users eligibility
		          * if score < 600-->not eligible
		          * if score between 600 -700 -->may be eligible
		          * if score 701-800--> eligible
		          * if score > 800--> definitely eligible
		          *
		          "The eligibility is ___"*/
		         
		          String result = null;
		          int Score;
		         
		         
		         
		         if (!loan) {
		              System.out.println("The eligibility is Unknown");
		          } else {
		            System.out.println("What is your credit score?");
		            Score=scan.nextInt();
		            if (Score<600) {
		              result ="Not eligible";
		            } else if (Score>=600 && Score<=700){
		              result ="May be eligible";
		            } else if (Score >=701 && Score<=800){
		              result ="Eligible";
		            } else if (Score>800){
		              result ="Definitely eligible";
		            } else {
		              System.out.println("I have an execellent score");
		            
		            }
		        
		              System.out.println("The eligibility "+result);
		              
		            }
		            }
	        
		    
	}


