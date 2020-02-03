package com.class24;

public class Car {

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	Car(String carmake,String carmodel,int carnumberOfDoors,int cartopSpeed,double carprice) {
	make=carmake;
	model=carmodel;
	numberOfDoors=carnumberOfDoors;
	topSpeed=cartopSpeed;
	price=carprice;
	
	}
	Car(String carmake,String carmodel,int cartopSpeed,double carprice) {
		make=carmake;
		model=carmodel;
		//numberOfDoors=carnumberOfDoors;
		topSpeed=cartopSpeed;
		price=carprice;
	}
	
	Car(int carnumberOfDoors,int cartopSpeed,double carprice) {
		make="unknown";
		model="unknown";
		numberOfDoors=carnumberOfDoors;
		topSpeed=cartopSpeed;
		price=carprice;
}
	Car(String carmake,String carmodel,int carnumberOfDoors) {
		make=carmake;
		model=carmodel;
		numberOfDoors=carnumberOfDoors;
		//topSpeed=cartopSpeed;
		//price=carprice;
}
	void test() {
	System.out.println(make+ " "+model+ " "+numberOfDoors+ " "+topSpeed+ " "+price);
}
	
	public static void main(String[] args) {
		Car c1=new Car("Toyota","Prius",4,120,30000.0);
		Car c2=new Car("Toyota","Prius",4,120,30000.0);
		Car c3=new Car(4,120,30000.0);
		Car c4=new Car("Toyota","Prius",4,90,0.0);
		c1.test();
		c2.test();
		c3.test();
		c4.test();
	}
}
