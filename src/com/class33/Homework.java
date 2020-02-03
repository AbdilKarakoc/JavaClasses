package com.class33;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {
		
		ArrayList<String>Cars=new ArrayList<>();
		Cars.add("Kia");
		Cars.add("Toyota");
		Cars.add("BMV");
		
		System.out.println("*******************FIRST WAY***********");
		for(String cars:Cars) {
			System.out.println(cars);
			
		}
		System.out.println("*******************SECOND WAY************");
		for(int i=0;i<Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}
	}

}
