package com.class11;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] number = {

				{ 5, 12, 18, 75 }, { 64, 23, 43, 1 }, { 73, 41, 90, 21 },

		};
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {

				if (number[i][j] % 2 == 0) {
					System.out.print(number[i][j]+" ");

				}
				sum = sum + number[i][j];
				//System.out.println();
			}
			System.out.println();
		}
		System.out.println(sum);
		
		
		for(int num1[]:number) {
			for(int num2:num1) {
				//System.out.print(num2+" ");
				if(num2%2==0) {
					System.out.print(num2+" ");
				}
				
			
			}
			System.out.println();
			
			}
		
	}
}
