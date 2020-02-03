package com.class23;

public class SyntaxTechnologies {
	 String name;
	int batch;
	 String year;
	 String lastDayOfClass;
	 
	 SyntaxTechnologies() {
		  
	 }
	 SyntaxTechnologies(String schoolname, int schoolbatch, String schoolyear,String lastDayOfClasss) {
		 
		 name=schoolname;
		 batch=schoolbatch;
		 year=schoolyear;
		 lastDayOfClass=lastDayOfClasss;
	 }
	 
	 void display() {
		 System.out.println(name+ " "+ batch+ " "+year+" "+lastDayOfClass);
	 }
		  
	 public static void main(String[] args) {
		 SyntaxTechnologies obj=new SyntaxTechnologies();
		 obj.display();
		 SyntaxTechnologies obj1=new SyntaxTechnologies("Syntax",4,"2019","07/30/2019");
		 obj1.display();
	}
	 
}
