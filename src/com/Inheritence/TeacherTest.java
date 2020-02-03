package com.Inheritence;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher obj=new Teacher();
		System.out.println(Teacher.name);
		System.out.println(obj.hair);
		System.out.println(obj.wear);
		System.out.println(obj.age);
		System.out.println(obj.teach);
		obj.work();
		obj.wake();
		System.out.println("*******************************");
		MathTeacher obj1=new MathTeacher();
		System.out.println(Teacher.name);
		System.out.println(obj1.hair);
		System.out.println(obj1.wear);
		System.out.println(obj1.age);
		System.out.println(obj1.teach);
		obj1.play();
		obj1.teach();
		System.out.println("*******************************");
		
		ChemistryTeacher obj2=new ChemistryTeacher();
		System.out.println(Teacher.name);
		System.out.println(obj2.hair);
		System.out.println(obj2.wear);
		System.out.println(obj2.age);
		System.out.println(obj2.teach);
		obj2.teach();
		obj2.hate();
		
		System.out.println("*******************************");
		PianoTeacher obj3=new PianoTeacher();
		System.out.println(Teacher.name);
		System.out.println(obj3.hair);
		System.out.println(obj3.wear);
		System.out.println(obj3.age);
		System.out.println(obj3.teach);
		obj3.teach();
		obj3.love();
	}

}
