package com.class05;

import java.util.Scanner;

public class CreditExs {

	public static void main(String[] args) {
		

		 
		        Scanner gh = new Scanner(System.in);
		        
		        
		                        
		        System.out.println("Do you have credit card True/False");
		        boolean cc = gh.nextBoolean();
		    
		        if (cc) {
		            System.out.println("What is the balance?");
		            int balance = gh.nextInt();
		            
		            if (balance >1000) {
		                System.out.println("Pay off immediatly");
		            }
		            else {
		                System.out.println("You can spend more");
		            }
		            
		            
		        }
		        else {
		            
		            System.out.println("Do you want to apply for CC?");
		        }
		        
		        System.out.println("***************");
		        
		        System.out.println("how many years you worked?");
		        int worked = gh.nextInt();
		        
		        
		        if (worked>=5) {
		            System.out.println("you are eligible for bonus");
		            System.out.println("What is your salary?");
		            int salary = gh.nextInt();
		            if (salary>50000) {
		                System.out.println("your bonus is $5000.00");
		            }
		            else {
		                System.out.println("your bonus $3000.00");
		            }
		            
		        }
		        else {
		            System.out.println("you are not eligible for bonus");
		        }
		        
		    }
		}
		

