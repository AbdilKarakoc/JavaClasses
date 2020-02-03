package com.Reviewmanu;

public class Main {
	static void Abdil() {
	    System.out.println("method without parameter");
	  }
	  
	  static void Abdil(String a){
	    System.out.println("method with int parameter");
	  }
	  public static void main(String[] args) {
	    Main obj=new Main();
	    obj.Abdil();
		obj.Abdil("iString a");
	    
	  }
	
}
