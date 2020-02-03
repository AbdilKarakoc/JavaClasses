package com.Forloophomeowrk;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*rite a guessing game where the user hasto guess a secret number between
 *  1 and 20.After  every  guess  input,  the  program  tellsthe  user 
 *   whether  their  number  was  toolarge  or  too  small.  The  program 
 *    will  keepasking  the  user  to  enter  the  number  untilhe  finds
 *      the  correct  number.  When  thecorrect answer is found the system
 *       shoulddisplay "Congratulations!!. You got it!"
 */
		
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=20; i++) {
		System.out.println("guess a secret number between 1 and 20.");
			i=input.nextInt();
			if(i==9) {
				System.out.println("Congratulation");
				break;
			}else if(i<9) {
				System.out.println("Number is too small");
			}else {
				System.out.println("Number is too large");
			}
	}

}
}
