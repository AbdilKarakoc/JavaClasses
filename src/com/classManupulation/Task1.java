package com.classManupulation;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sunday";
		System.out.println(name.charAt(5)+ " "+name.charAt(4)+ " "+name.charAt(3)+ " "+name.charAt(2)+ " "+name.charAt(1)+ " "+name.charAt(0));
		
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
			
			
		}
	System.out.println();
		System.out.println("*****************************");
		
	String str1="Hellohello";
	int middle=str1.length()/2;
	if(!str1.isEmpty()) {
		
		if(str1.length()%2!=0 && str1.length()>=3) {
			System.out.println(str1.charAt(middle));
			
		}
	}
	}
}