package com.class18;



public class Task {

	
	void num(int a ,int b) {
	if(a>b) {	
	System.out.println("a is larger than b");
	
	}else {
		System.out.println("b is larger than a");
	}
	}
	void comp(int a) {
		if(a%2==0) {
			System.out.println("a is even number");
	
		}else {
			System.out.println("b is odd number");
		}
	}
	void palindrome(String word) {
        String reverse="";
        for (int i=word.length()-1;i>=0; i--) {
            reverse=reverse+word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
	}
	

	
	public static void main(String [] args) {
	
		Task nums=new Task();
		nums.num(70, 80);
		nums.comp(46);
		nums.palindrome("hello");
		nums.palindrome("kayak");
	}
}
