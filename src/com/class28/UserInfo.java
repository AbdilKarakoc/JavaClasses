package com.class28;

public class UserInfo extends User {
String address;


public UserInfo(String name,int number, String address) {
	super(name,number);
	this.address=address;
}
public void display() {
	  System.out.println("My name is "+name+" and my phone number is "+number+" and my adress is "+address);
}

public static void main(String[] args) {
	UserInfo obj= new UserInfo("Abdil", 571544455, "3338 stone heather");
	obj.display();
}
}

