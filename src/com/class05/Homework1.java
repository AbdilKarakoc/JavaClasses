package com.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Write a program that will read three inputs of scores
		//(quiz, mid term, and final scores)
		//	and determine the grade based on the following rules:
		
		//if the average score >=90 â?’ grade=A
		//â—?if the average score >= 70 and <90 â?’ grade=B
		//â—?if the average score>=50 and <70 â?’ grade=C
		//â—?if the average score<50 â?’ grade=F
		
		Scanner scan;
        int guiz;
        int midterm;
        int finalexam;
        int avarage;
        char grade1;
        scan = new Scanner(System.in);
        System.out.println("What is   your guiz score?");
       
        guiz = scan.nextInt();
        System.out.println("What is your midterm score");
       
        midterm = scan.nextInt();
        System.out.println("What is your finalexam score");
      
        finalexam = scan.nextInt();
        avarage = (guiz + midterm + finalexam) / 3;
		
		
		if(avarage>=90) {
			System.out.println("grade=A");
			
		}else if(avarage>=70 && avarage<90) {
			System.out.println("grade:B");
			
		}else if(avarage>=50 && avarage<70) {
			System.out.println("grade:C");	
			
		}else if(avarage<50) {
			System.out.println("grade:F");
		}
	}

}
