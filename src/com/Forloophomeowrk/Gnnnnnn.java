package com.Forloophomeowrk;

import java.util.Scanner;

public class Gnnnnnn {
//Create an int array with the size of 5 and input values with Scanner. 
	//Create a loop and enter values into one loop (don't print prompt question for Scanner). 
			//Create the second loop to print the values and it must be multiplied by 10.
			//Print out each element of the array multiplied by ten, one element per line.
	
	
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int[] arr = new int[5];
			for (int i=0;i<arr.length;i++)
			arr[i] = input.nextInt();
				
			for(int j=0;j<5;j++) {
				
			System.out.println(arr[j]*10);
			}
			
			}
		}
