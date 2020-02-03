package com.class26;

public class Bank {
	
	double money;
	public double chargeFee() {
		double fee=0;
		if (money<1000) {
			fee=money*0.1;
		}else {
			fee=0;
			
		}
		return fee;				//overriding same method exist with super class and subclass
								//in Method overriding Method Signature (name and parametter)must be same.
	}
}

class PNC extends Bank{
	
	public double chargeFee(){
		
		double fee;
		if (money<1000) {
		fee=money*0.05;
		
		}else{
			fee=0;
		}
		return fee;
}
}
