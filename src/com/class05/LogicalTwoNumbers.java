package com.class05;

public class LogicalTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=12;
		if (num1==num2) {
			System.out.println("Numbers are equal");
			
		}else { 
			System.out.println("Numbers are not equal");
			
			if(!(num1==num2)) {
				System.out.println("Numbers are not equal");
				
				
			}else {
				System.out.println("Numbers  are equal");
				
				
			
			}
			
			//if nme is not Marry or Anna then you are not my sister
			String name="Marry";
			
			String name2="Anna";
			
			if(!(name.equals("Mary") || name2.equals("Anna"))) {
				System.out.println("You are not my sister");
		
			}else {
				System.out.println("You are my Sister");
		
		}
		
		}
	}

}
