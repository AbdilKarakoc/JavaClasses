package com.class27;

public class Card {

	//define  class card with 2 methods and this class should have 4 subclasses which some behavior can be
	//overridden and some can implement and it i own behavior
	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}
	public void creditLimit() {
		System.out.println("Card limit of the card is 5000");
	}
}

class AX extends Card{
public void creditLimit() {
	System.out.println("Card limit of the card is 2500");
}


}
class MC extends Card{
	public void creditLimit() {
		System.out.println("Card limit of the card is 15000");
	}		
		public void cashBack() {
			System.out.println("MC gives cash back of 3%");
	}
	
}
class VISA extends Card{
	public void creditLimit() {
		System.out.println("Card limit of the card is 15000");
	}
		public void applePay() {
		System.out.println("Discovery can take apple pay");
	}
	
}