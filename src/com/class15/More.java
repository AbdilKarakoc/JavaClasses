package com.class15;

public class More {

	public static void main(String [] args) {
		
		
		String str="Java classes at Syntax are awesome";
		str=str.replace("awesome", "great");
		System.out.println(str);
		str=str.replace("aa", "AA");
		System.out.println(str);
			
		
		//split
		
		String myString="Java classes at Syntax are awesome";
		String[] array=myString.split("c");
		System.out.println(array.length);
	}
	
	
}
