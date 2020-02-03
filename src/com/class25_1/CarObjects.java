package com.class25_1;
public class CarObjects {
String item;
double price;
int quantity;
CarObjects(String item, double price, int quantity){
	this.item = item;
	this.quantity = quantity;
	this.price = price;
}
double carStockValue() {
	double Total = quantity*price;
	System.out.println(item+" Total Value "+Total);
	return Total;
}
public static void main(String[] args) {
	CarObjects Blancket = new CarObjects ("Blancket",49.99,2);
	double BlanTotal = Blancket.carStockValue();
	CarObjects  Mattress = new CarObjects ("Mattress",219.59,2);
	double MatTotal = Mattress.carStockValue();
	double sum = BlanTotal+MatTotal;
	System.out.println("You purchased "+sum+" Today");
}
}