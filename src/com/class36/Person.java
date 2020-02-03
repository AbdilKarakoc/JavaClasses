package com.class36;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class person1{
	
private	String name;
private	int age;
private	int salary;
	
person1(String name,int salary,int age){
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	public void display() {
		System.out.println(name+" "+age+" "+salary);
	}
}


public class Person {
	
	public static void main(String[] args) {
		Map<Integer,person1>obj=new TreeMap<Integer, person1>();
		obj.put(1, new person1("Deniz Babayaka", 100000, 43));
		obj.put(2, new person1("Abdil Abi", 120000, 42));
		obj.put(3, new person1("Asim Abi", 150000, 45));
		Set<Integer>obj2=obj.keySet();
		//Set<Entry<String, Integer>> entrySet = classRoom.entrySet();
		for(Integer obj3:obj2) {
			System.out.print("Person id :"+obj3+" ");
			obj.get(obj3).display();
	}
	}
	
	
	
	
	
	
}
