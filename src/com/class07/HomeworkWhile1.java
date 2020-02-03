package com.class07;

import java.util.Scanner;

public class HomeworkWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*you need to ask user to pay for coffee
		 * you need to keep asking user to pay for it until entered price is equal=5;
		 * After user paid then say "Enjoy your coffee";
		 * 
		 
		 */
		Scanner scan=new Scanner(System.in);
	       int price;
	      
	       do {
	       System.out.println(" Please pay for coffee");
	       price=scan.nextInt();
	       
	       }while(price!=5);
		       
	       System.out.println(" Thanks you and enjoy your coffee");
	   }
	       }
