package com.class24;

public class Student {
//Write program as a Student class   that has instance variables name and address. Create a constructor that will initialize those variables. 
	//Print name & address of given  student by the displayInfo method.
	
	String name, address;
	
	Student(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
		void display() {
			System.out.println("Student name is "+ name);
			System.out.println("Student address is "+ address);
			
		}
		
		public static void main(String[] args) {
			
			Student obj=new Student("Abdil Karakoc", "3338 stone heather herndon" );
			obj.display();
			
			
		}
		
	}

