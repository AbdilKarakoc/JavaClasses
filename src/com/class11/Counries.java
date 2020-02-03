package com.class11;

public class Counries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] countries= {"India", "Canada","USA"};
		for(String getCountry:countries) {
			if(getCountry.contentEquals("USA")){
			System.out.println("The capital of USA is Washinton DC");
			
		}
	}

		
		for( int i=0; i< countries.length; i++) { 
			if(countries[i].equals("USA")){
				System.out.println("The capital of USA is Washinton DC");
		}
	}
}
}
