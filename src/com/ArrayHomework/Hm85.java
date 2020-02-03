package com.ArrayHomework;

public class Hm85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		boolean x=true;
		for(int i=0;i<a.length; i++) {
			for(int j=0; j<1; j++) {
				//System.out.print(a[i][j]+",");
				
				if(i==j) { 
					System.out.println(x);
				}
			}
			//System.out.println();
		}
	}
}
