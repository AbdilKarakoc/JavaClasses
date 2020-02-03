package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BMW car =new BMW("76677SHSH","sEDAN","BMW","X5");
	BMW.displayTotal();
	car.drive();
	car.speed();
	car.start();
	car.stop();
	car.breaking();
	car.display();
	
	System.out.println("*********************************");
	
	Vehicle vehicle=new BMW("HSHSHSHSHSH","sedan","Car","x55");
	vehicle.drive();
	vehicle.speed();
	vehicle.start();
	vehicle.stop();
	//Vehicle vehicle1=new BMW("HSHSHSHSHSH","sedan","Car","x55");
	//Vehicle vehicle3=new BMW("HSHSHSHSHSH","sedan","Car","x55");
	//Vehicle vehicle5=new BMW("HSHSHSHSHSH","sedan","Car","x55");
	BMW.displayTotal();
	
	}

}
