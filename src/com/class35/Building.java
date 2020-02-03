package com.class35;

import java.util.HashMap;

public class Building {

	public static void main(String[] args) {
		
		HashMap<Integer,String> build=new HashMap<>();
		
		build.put(1,"Google");
		build.put(2,"Syntax");
		build.put(3,"Cococola");
		build.put(1,"Google");
		build.put(2,"Syntax");
		build.put(4,"Pepsi");
		build.put(5,"Itec");
		
		System.out.println(build.size());
		build.replace(1, "Geogle", "Abdil");
		String buildelement=build.get(5);
		
		System.out.println(buildelement);
		System.out.println(build);
		
	}

}
