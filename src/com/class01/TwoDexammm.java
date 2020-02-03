package com.class01;

public class TwoDexammm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] number={
			
				{3,4,5,6},
				{5,7,8,2},
				{1,0,3,2}
			
		};
		int sum=0;
		System.out.println(number.length);
		System.out.println(number[0].length);
		
		for(int i=0;i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				System.out.print(number[i][j]+ " ");
				
				sum=sum+number[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of " + sum);
	}

}
