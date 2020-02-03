package com.class10;

public class Capitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of countries. While retrieving all values from an array print capital for each country. 
		
		String[] countries= {"Thailand","Cambodia","Laos","Vietnam"};
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals("Thailand")) {
				System.out.println("Capital is Bangkok");
				}else if(countries[i].equals("Cambodia")) {
					System.out.println("Capital is Phon Phen");	
				}else if(countries[i].equals("Laos")) {
					System.out.println("Capital is Vientinae");	
				}else if(countries[i].equals("Vietnam")) {
					System.out.println("Capital is Hanoi");	
		}
		
	}
		
	}
}



