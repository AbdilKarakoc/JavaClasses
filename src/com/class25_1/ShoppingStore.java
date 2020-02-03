package com.class25_1;

public class ShoppingStore {
	 String item;
	  double price;
	  int quantity;
	 
	  
	  ShoppingStore(String item,double price,int quantity) {
	    this.item=item;
	    this.price=price;
	    this.quantity=quantity;
	  
	  }
	  
	  double itemTotalPrice(){
	    
	    double Total=quantity*price;
	    System.out.println(item + "Total Value" +Total);
	    return Total;
	  }
	  public static void main(String[] args) {
	      ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      double abdil=blancket.itemTotalPrice();
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      double abdil1=mattress.itemTotalPrice();
	     double sum=abdil+abdil1;
	      System.out.println("You purchased "+sum+" Today");
	      
	      //Complete the Application
	  }
	  
	}
	


