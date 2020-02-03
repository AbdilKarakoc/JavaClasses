package com.Review10;

public class Doctor {
	String name;
	String speciality;
	int licenceID;
	String address;
	String dayof;
	
	public Doctor(String names,String specialityy,int licenceIDD) {
		this.name=names;
		this.speciality=specialityy;
		this.licenceID=licenceIDD;
	}
	public Doctor(String names,String specialityy,int licenceIDD,String addresss,String dayoff) {
		this.name=names;
		this.speciality=specialityy;
		this.licenceID=licenceIDD;
		this.address=addresss;
		this.dayof=dayoff;
	}
	
	public void displayInfo() {
		System.out.println("Doctor " +name+ " with licenseID: " +licenceID+ " is a " + speciality);
	}
}
