package com.class10;

import java.util.Scanner;

public class Odevvvvvv {
/*Create an int array with the size of 5 and input values with Scanner. 
Create a loop and enter values into one loop (don't print prompt question for Scanner). 
Create the second loop to print the values and it must be multiplied by 10.
Print out each element of the array multiplied by ten, one element per line.

Example:
Input:
1
2
3
4
5

Output:
10
20
30
40
50
*/


	
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = input.nextInt();
			arr[i]=arr[i]*10;
			
	
			
	
		System.out.println();
	}
		}
}
	

