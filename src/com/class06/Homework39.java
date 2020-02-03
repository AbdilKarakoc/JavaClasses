package com.class06;

import java.util.Scanner;

public class Homework39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
	//case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
	//case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
	//case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

//	Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
		
		String name;
		String resp;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the instroctor");
		name=input.nextLine();
		
		switch(name) {
		case "shiva":
			resp="Will take care of Java Assignment";
		break;
		case "sandish":
			resp="Will take care of SDLC Assignmentt";
		break;
		case "wegas":
			resp="Will take care of Selenium Assignment";
		break;
		case "asel":
			resp="Will take care of every Assignment";
		break;
		default:
			resp="Invalid instructor selected";
		}
			System.out.println(resp);
			   
			   
	}

}
