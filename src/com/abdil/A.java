package com.abdil;

public class A {
int i=10;
}
class B extends A{
	static int i=20;

public static void main(String[] args) {
	B obj=new B();
	System.out.println(i);
}
}