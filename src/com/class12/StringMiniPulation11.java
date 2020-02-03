package com.class12;

public class StringMiniPulation11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//This method checks whether a String is empty or not.
		//This method returns true if the given string
		//is empty, else it returns false
		
		String str="";
		System.out.println("Is this string empty="+ str.isEmpty());
		String str2="Hello";
		System.out.println("is this string empty="+str2.isEmpty());
		System.out.println();
		
		String sentence="Each day has a promise to brighten up the day,\nBut first you must allow the sun to come your way";
		
		
		
		String str3="Hello ";
		String str4=" World";
		String str5=" People";
		System.out.println(str3+str4+str5);
		System.out.println(str3.concat(str4).concat(str5));
		
		
		
		System.out.println("********************************************");
		
		String str6="How are you  ";
		//System.out.println(str6.trim());
		System.out.println(str6);
		
		String str7="We might be done early today";
		System.out.println(str7.charAt(0));
		System.out.println("********************************************");
		
		String str8="We might not be early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('e',12));

}
}

