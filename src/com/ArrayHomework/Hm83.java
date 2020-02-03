package com.ArrayHomework;

public class Hm83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
		
		int row = 2;
		int total = 0;
		for (int j = 0; j < a[row].length; j++) {
			total = total + a[row][j];
		}
		System.out.println( total);
	}
}
	
     
	


