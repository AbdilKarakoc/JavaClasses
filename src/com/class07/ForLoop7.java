package com.class07;

public class ForLoop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* write a code to find the sum of even or odd numbers
		 * from range 1to20
		 * expecting 2 outputs
		 * sum for odd num
		 * sumof even num
		 * 
		 */
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
		sumEven=sumEven+i;	
		}else {
			sumOdd=sumOdd+i;

		}
	}
		System.out.println("The total of all even#="+sumEven);
		System.out.println("The total of all even#="+sumOdd);	
	}
	}
	


