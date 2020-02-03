package com.class23;

public class Student {

	/*Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks.
	 *  Your program should print an average mark of each students name.
	 */
	
	String name;
	int grade1,grade2,grade3;
	
	Student(String studentName, int gr1,int gr2,int gr3) {
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
		
		public static void main(String[] args) {
			Student student1=new Student("John",90,78,100);
			student1.calculateAverage();
			Student student2=new Student("Ahmet",90,78,100);
			student2.calculateAverage();
			Student student3=new Student("Mehmet",90,78,100);
			student3.calculateAverage();
			Student student4=new Student("Hasan",90,78,100);
			student4.calculateAverage();
			Student student5=new Student("Veli",90,78,100);
			student5.calculateAverage();
		}
	
	
	public void calculateAverage() {
			int average=(grade1+grade2+grade3/3);
				System.out.println("Student "+name+ " has an avarage grade of "+ average);
			}
		}
		
	
	
	
	
	

