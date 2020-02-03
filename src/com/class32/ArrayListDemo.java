package com.class32;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		//to store values inside you collection
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		//to retrieve the value from arraylist
		System.out.println(arrayList.get(1));
		
		//add more values
		arrayList.add("James");
		arrayList.add("john");
		arrayList.add("Jane");
		
		//update the value
	
		
		
	// how many elements inside the arrayList
		int size=arrayList.size();
		System.out.println(size);
		
		//creatig an Object og ArrayList that will hold numberic values
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		
		numArrList.set(0,1000);
		System.out.println(numArrList);
		
		//retrieving values
		System.out.println(numArrList.get(2));
		
		for(int num=0;num<numArrList.size();num++) {
			System.out.println(numArrList.get(num));
		}
		//emhamce loop
		for(Integer number:numArrList) {
			System.out.println(number);
		}
		
	}

}
