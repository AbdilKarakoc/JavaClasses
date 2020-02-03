package com.class12;

public class FindDublicateArray {

	public static void main(String[] arags) {

		int[] array2 = { 2, 5, 4, 7, 5, 2 };

		for (int i = 0; i < array2.length; i++) {

			for (int j = i + 1; j < array2.length; j++) {
			if(array2[i]==array2[j]) {
				System.out.println(array2[j]);
			}
			}

		}

	}

}
