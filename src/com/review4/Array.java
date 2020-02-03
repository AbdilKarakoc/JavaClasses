package com.review4;

public class Array {

	  public static void main(String[] args) {
	        int a1 = 4;
	        int a2 = 5;
	        int a3 = 7;
	        int a4 = 9;
	        int a5 = 2;
	        int sum = a1 + a2 + a3 + a4 + a5;
	        // serios way
	        int[] a = new int[5];
	        a[2] = 7;
	        a[4] = 9;
	        a[0] = 2;
	        int sum1 = 0;
	        for (int i = 0; i < a.length; i++) {
	            // System.out.print(a[i] + " ");
	            sum1 = sum1 + a[i]; //sum1+=b[i]  short way
	        }
	       
	       System.out.println(sum1);
	        int[] b = { 4, 5, 7, 2, 9 };
	        int sum2 = 0;
	        for (int i = 0; i < b.length; i++) {
	            sum2 = sum2 + b[i];
	        }
	        System.out.println(sum2);
	    }
	}