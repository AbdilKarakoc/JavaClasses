package com.class06;

public class Homework34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Declare 4 int variables a, b, c and d. 
Your variable c is the result of addition of a & b. 
Variables a & b should be more than d, and c should be more than d. 

Output: 
true
true

Hint: you have 2 outputs meaning you need to have 2 printing statements
*/
		
	int a=8;
	int b=10;
	int c=(a+b);
	int d=5;
	
	
	
boolean name=false;
boolean name2=false;


	if(d<a&& d<b) {
		name=true;
		System.out.println(name);
	}
	else {
		name =false;
		System.out.println(name);
		
	}

	if(c>d) {
		name2=true;
		System.out.println(name2);
	}else {
		name2=false;
		System.out.println(name2);
	}
	
	}
}
