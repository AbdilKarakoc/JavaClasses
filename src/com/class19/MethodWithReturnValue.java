package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		// declare a String and if String has more than 1o characters---->String is large
		//otherwise ----> String is small
		MethodWithReturnValue obj1=new MethodWithReturnValue();
		int sum=obj1.sum(50,50);
		System.out.println(sum);
		
		String str="Welcome home";
		int numOfChars=str.length();
		if(numOfChars>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
			
		}
		char abdil=str.charAt(4);
		System.out.println(abdil);
		
		//create an object of the class where methodis defined
		Recap obj=new Recap();
		//int num=obj.sum(10, 30); compile error saying change return type
		
	}
	// return type, method name (list of parameters)
	int sum(int num1, int num2) {
		
		int c=num1+num2;
		return c;
		
	}
	
		
	
}
