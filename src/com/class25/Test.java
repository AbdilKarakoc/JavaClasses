package com.class25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Creating an objetc of Employeee class");
		Employeee emp=new Employeee();
		emp.salary=70000;
		Employeee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		System.out.println("Creating an objetc of ScrumTeam class");
		
		System.out.println("*****************************");
		
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog,BurnDown Chart";
		sm.ceremonies="Sprint demo,Planing,Retro, Daily Standup ";
		sm.attendScrumMeetings();
		
		System.out.println("*****************************");
		
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Baclog";
		dev.ceremonies="Sprint Demo,Planing";
		dev.attendScrumMeetings();
		
		System.out.println("*****************************");
		System.out.println("Creating an objetc of Tester class");
		Tester ts=new Tester();
		ts.salary=60000;
		ts.work();
		ts.getPaid();
		ts.test();
		
		System.out.println("*****************************");
		System.out.println("Creating an objetc of Productowner class");
		
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.work();
		po.getPaid();
		po.prioritize();
	}

}
