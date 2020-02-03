package com.class24;

public class Book {
 //Write program as a Book class   that will have 2 Constructors. 
	//While creating an object make sure:Instance variables are being initializedBoth Constructors are being executed	
	
	
	String name;
	int page;
	boolean old;
	String color;
	
	
	Book(String name,int page) {
		this.name=name;
		this.page=page;
	}
	
	Book(String color,boolean old) {
		this.color=color;
		this.old=old;
	}
	
	void bookdisplay() {
		
		System.out.println("Book name is "+this.name + " and it has "+this.page+ " it is " +this. color+ " and it is " +this.old);
	}
	
	public static void main(String[] args) {
		
		Book obj=new Book("Cry Freedom",350);
		obj.bookdisplay();
		Book obj1=new Book("white",true);
		obj1.bookdisplay();
	}

	
		
	}
	

