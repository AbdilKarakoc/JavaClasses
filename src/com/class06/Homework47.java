package com.class06;

import java.util.Scanner;

public class Homework47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*or you to do:
Declare boolean variable isSunny, ask user to input boolean value. 
Declare int temperature and prompt user to input any value. 

Your program should check:
if is it sunny weather or not. 
If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
If it is not sunny output should be "I stay home and practice Java"
If the weather is sunny you want to check the temperature. 
If the temperature is higher than 85 then "I am going to the beach"
otherwise, "I am going to the park"

Instruction: after you run your code, start inputing your values without Prompt question to appear. 

Hint: your temperature value should not be equal to 85. 

if (isDisplayed) {
			System.out.println("Button is displayed");
			
			if (buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			}else {
				System.out.println("Wrong text is displayed");
*/

		
	
		Scanner scan = new Scanner(System.in);
		int object;
		  System.out.println( "Please enter a number ");
		     object = scan.nextInt();
		 if (object > 400) {
		 if (object <= 600){
		   System.out.println( "don't calculate commission");
		 }
		else  if (object >= 600){
		   System.out.println("Value is too large");
		 }
		}
		else { System.out.println("calculate commission");
		}
		}
		}