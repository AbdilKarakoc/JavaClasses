package com.class07;

import java.util.Scanner;

public class ForLoop89898 {

	public static void main(String [] args) {
	
		
		String card;
		Scanner input=new Scanner(System.in);
		for(int q=1; q<=10; q++) {
		
			System.out.println("Do you appyly for credit card");
			card=input.nextLine();
			if(card.equalsIgnoreCase("yes")) {
			break;
		}
		
			
		}
	}
}
