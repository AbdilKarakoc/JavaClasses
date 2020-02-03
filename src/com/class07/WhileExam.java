package com.class07;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*LETS ASK USER TO ENTER  IF IT IS RAINING OR NOT (TRUE ORFALSE)
		 * as long as thete is rain lets keep asking
		 * as soon as there is no rain--->you can go to park.
		 *
		 */
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		
		do {
			System.out.println("Is it raining");
			
			isRain=scan.nextBoolean();
		}while(isRain);
		
		System.out.println("Go to the park");
	}

}
