package com.class12;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[4];

		array[0] = 12;
		array[1] = 13;
		array[2] = 14;
		array[3] = 15;
		System.out.println(array[1]);
		System.out.println("*************************");
	
		
		int num1=0;
		for (int i = 0; i < 4; i++) {
			
			num1=num1+array[i];
			
			//System.out.println("The sum of this array is =" +num1);
			System.out.println(array[i]);
			System.out.println("*************************");

			System.out.println("The sum of this array is =" +num1);
			
			for (int j : array) {
				System.out.println(j);
			}
		}

	}
}
