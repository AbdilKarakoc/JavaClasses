package com.class16;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="Welcome to the Java class";
		
		//String[] str=given.split("\\s");
		//for(int i=str.length-1;i>=0; i--) {	
		//System.out.print(str[i]+" ");
		
		String reversed="";		
		String[] str1=given.split("\\s");
		for(int j=str1.length-1;j>=0; j--) {	
		reversed=reversed+str1[j]+" ";		
}
	System.out.println(reversed);	
	
	//Write a java program to reverse String
	//toCharArray(); charAt();
	
	// recersed icin chartAr veya toCharAray kullanulanibilir.
	
}
}
