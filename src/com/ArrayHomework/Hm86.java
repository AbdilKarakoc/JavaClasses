package com.ArrayHomework;

public class Hm86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			
		int rows=0;
		for(int i=0; i<a.length; i++) {
			
			for(int j=0;j<a[i].length; j++) {
				
				rows=rows+a[i][j];
				
				
			}
			System.out.println(rows);
			rows=0;
			System.out.println();
	}

}
}
