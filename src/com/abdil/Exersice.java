package com.abdil;

class Person{
	  
String name;
String lastName;
int age;
	
  
}


class Employee extends Person{
	  
	  
	  int salary;
	  
	  void print(){
	    
	    System.out.println(name + " " + lastName + " " + age + " " + salary);
	  }
	  
	  
	}

class Student extends Person{
	  
	  int grade;
	  
	   void print(){
	    
	    System.out.println(name + " " + lastName + " " + age + " " + grade);
	  }
	 
	}
class Retiree extends Person{
	  
	  String seniorActivity;
	  
	     void print(){
	    
	    System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
	  }
	  
	  
	}




