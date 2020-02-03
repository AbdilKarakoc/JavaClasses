package com.class23;

public class StoreProduct {

	String label;
	double price;
	String category;
	boolean hasExpiration; 
	int stock;
	
	StoreProduct(String booklabel,double prc,String ctr,boolean hEx,int stk) {
		label=booklabel;
		price=prc;
		category=ctr;
		hasExpiration=hEx;
		stock=stk;
		
		
	}
	StoreProduct(String booklabel,double prc,int stk) {
		label=booklabel;
		price=prc;
		category="misc";
		//hasExpiration=hEx;
		stock=stk;
	}
	StoreProduct(String booklabel,double prc) {
		label=booklabel;
		price=prc;
		//category=ctr;
		//hasExpiration=hEx;
		//stock=stk;
	}
	

	void display() {
		System.out.println(label+ " " +price+ " " +category+ " " +hasExpiration+ " " +stock);
	}
	
	
	public static void main(String[] args) {
		StoreProduct obj=new StoreProduct("Eggs", 3.0, "Produce", true , 10);
		StoreProduct obj1=new StoreProduct("Paper Towels", 2.0,24);
		StoreProduct obj2=new StoreProduct("Paper Towels", 2.0);
		obj.display();
		obj1.display();
		obj2.display();
	}
}
