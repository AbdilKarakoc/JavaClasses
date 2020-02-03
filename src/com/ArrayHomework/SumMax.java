package com.ArrayHomework;

public class SumMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 } };
        int max = b[0][0];
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            for (int k = 0; k < b[i].length; k++) {
                sum += b[i][k];
                if (b[i][k] > max) {
                    max = b[i][k];
                }
            }
        }
        System.out.println("Max is :" + max);
        System.out.println("sum is " + sum);
    }
}