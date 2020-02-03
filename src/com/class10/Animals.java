package com.class10;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].contentEquals("Dog")){
				System.out.println("I LOVE DOGS");
				
			}else {
				
				
				System.out.println(animals[i]);	
				
			}
			
		}
	}

}
