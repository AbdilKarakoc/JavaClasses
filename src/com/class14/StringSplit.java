package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Video provides a powerful way to heldp you prove your point";
		String [] array=str.split(" ");
		for (int i=0; i <array.length; i++) {
	
		System.out.println(array[i]);
	}

	}
}
