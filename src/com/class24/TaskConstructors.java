package com.class24;

public class TaskConstructors {

	String name, city;
	int age;
	
	public TaskConstructors(String ownname) {
		
		
	}	private TaskConstructors(String ownname, int ownage) {
		
		
	}
	TaskConstructors(String ownname, int age,String owncity) {
		name=ownname;
		city=owncity;
	}
	protected TaskConstructors(int ownage)   {
		
	}
	public void display() {
		
		System.out.println(name+age+city);
	}
	
	public static void main(String[] args) {
		TaskConstructors obj=new TaskConstructors("Abdil");
		TaskConstructors obj1=new TaskConstructors("Abdil",40);
		TaskConstructors obj2=new TaskConstructors("Abdil",40,"Manisa");
		TaskConstructors obj3=new TaskConstructors(40);
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
	}
	
}
