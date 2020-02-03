package com.class16;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*write a java program to find whether a stirng is PALINDROME or not,
		 * if reversed string and original string are same 
		 * logic:
		 * step1: reverse the string
		 * step2:compare 2 string
		 * if string are qual--> polindrome
		 * else __> not plindrome
		 */
		
		
		String original="kayak";
		String reversed="";
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
		
		}
		System.out.println(reversed);
		if(original.contentEquals(reversed)) {
			System.out.println("String is palindrome");
			}else {
				System.out.println("String is Not palindrome");
			}
		
	}

}
