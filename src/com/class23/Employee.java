package com.class23;

public class Employee {
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Employee() {
		
	}
	
	Employee(String name1,String lastName1, int employeeId1,String startDate1, int salary1) {
	name=name1;
	lastName=lastName1;
	employeeId=employeeId1;
	startDate=startDate1;
	salary=salary1;	
	}
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		Employee obj1=new Employee("Joe","Simith",12345,"01/01/1970",35000);
		System.out.println(obj.name+ " "+ obj.lastName+ " "+ obj.employeeId+ " "+obj.startDate+ " "+obj.salary);
		System.out.println(obj1.name+ " "+ obj1.lastName+ " "+ obj1.employeeId+ " "+obj1.startDate+ " "+obj1.salary);
	}
}
