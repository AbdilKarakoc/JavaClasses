package com.interviewquestion;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 20; 
	        int y = 10; 
	        x = x + y; //15
	        y = x - y; //10
	        x = x - y; //5
	        System.out.println("After swaping:"+ " x = " + x + ", y = " + y); 
	       
	        
	        String a="Love";
	        String b="You";
	        System.out.println("Before swap: "+a+" "+b);
	        a=a+b;
	        b=a.substring(0, a.length()-b.length());
	        a=a.substring(b.length());
	        System.out.println("After: "+a+" "+b);


	    } 
	} 

