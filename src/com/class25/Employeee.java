package com.class25;

public class Employeee {

	int salary;
	static String companyName;
	protected int employeeeId;
	private String employeeeSsn;
	
	
	void work() {
		System.out.println("I work in "+ companyName+ "company");
	}
	void getPaid() {
		System.out.println("I getpaid "+ salary);
		
	}
}
