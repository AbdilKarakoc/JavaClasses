package com.class17;

public class Computer {

	
	String brand,name,monitor,mouse;
	String keyboard;
	int size,screen,memory,ram;
	
	
	void playgame() {
		System.out.println("I can play on my "+ name);
	}
	void javacoding () {
		
	System.out.println("I can do java coding on my" +name);

	}
	void watchmovie() {
		System.out.println("I can watch movie on my " +name);
	}
	
	void setkeyboard() {
		keyboard="I can tape";
		
	}
	
	void area(int a,int b) {
		int area=a*b;
		//System.out.println(area);
		
	}
	
	int areareturn(int a,int b) {
		int area=a*b;
		return area;
		
	}
	
	public static void main(String [] args) {
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javacoding();
		comp1.watchmovie();
		comp1.setkeyboard();
		comp1.area(5,10);
		
		//comp1.areareturn(8, 5);
		//int sonuc=comp1.areareturn(8, 5);
		
	}
}
