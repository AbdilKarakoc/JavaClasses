package com.Review10;

public class Hospital {
	
	public static void main(String[] args) {
		
	
		Doctor d1=new Doctor("John","Family Doctor" , 123456789);
		//d1.name="Dr John";
		//d1.speciality="Family doctor";
		//d1.licenceID=123456;
		d1.displayInfo();
		//d1.checkup("Adam");
		
		Doctor d2=new Doctor("James","Eye Doctor",234567,"1234 Main street.","Sunday");
	
		d2.displayInfo();
}
}