package com.class24;

public class Country {

	public String capital,name;
Country() {
	System.out.println("I am non argument constructor");
}
	Country(String countryName,String countryCapital) {
		name=countryName;
		capital=countryCapital;
	
		System.out.println("My country is "+name+ " and my capital city is "+capital);
	}
	public void display() {
		System.out.println( name +" "+ capital);
	}
	
	
	public static void main(String[] args) {
		
		//Country country1=new Country();
		//country1.name="USA";
		//country1.capital="Washington DC";
				
		//Country country2=new Country();
		//country2.name="Turkey";
		//country2.capital="Ankara";
		
		
	Country country1=new Country("USA","Washington DC");
	Country country2=new Country("Turkey","Ankara");
	Country country3=new Country();
	country1.display();
	country2.display();
	country3.display();
	}
	
	
}
