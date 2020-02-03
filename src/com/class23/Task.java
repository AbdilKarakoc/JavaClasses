package com.class23;

public class Task {

	/*Write a program that will have a constructor: one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */

		public static void main(String[] args) {
			Task obj=new Task();
			Task obt=new Task(1);
}

		
		
	Task() {
		System.out.println("This is a constructor without parameter!");
	}
		
		Task(int number) {
			System.out.println("This is a constructor with parameter!");	
			
		}
	
}
