package com.ArrayHomework;

public class Hm84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		int maxValue = a[0][0];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] > maxValue) {
                    maxValue = a[j][i];
                }
            }
        }
        System.out.println(maxValue);
	}
}