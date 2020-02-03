package com.class16;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a java program to check whether a given number is prime or  not
		//prime number= divisible by 1 and itself
		//2,35,7,11,13,17,19,23
		
		int num=5;
		boolean isPrime=true;
		for(int i=2;i<-num;i++) {
			
			if(num%i==0) {
				isPrime=false;
			
			}
		}
		
		if(isPrime) {
			System.out.println(num +" is a Prime number");
		
	}else { 
		System.out.println(num+ "is Not a Prime number");
	}
	}

}
