package com.class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Husky obj=new Husky();
		System.out.println(obj.name);
		obj.name="Sharik";
		System.out.println(obj.name);
		
		Husky.breed="New Breed";
		
		System.out.println(Husky.breed);
		System.out.println(obj.breed); // possible but not preferable
	}

}
