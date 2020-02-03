package com.class35;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		
map.put(101, "John");
map.put(102, "Jack");
map.put(103, "Jane");
map.put(104, "Jenny");

System.out.println(map);
	boolean flag=map.isEmpty();	
	if(!flag) {
		int size=map.size();
		System.out.println(size);
		System.out.println(map.size());
		
		
		//adding new key
		map.put(105, "Jonh");
		System.out.println(map);
		
		//replace
		map.put(102,"Hasan");
		System.out.println(map);
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		// remove
		map.remove(101);
		System.out.println(map);
		
		//how to verfy if certain key is exist
		boolean flag1=map.containsKey(103);
		System.out.println(flag1);
		
		if(flag1) {
			map.replace(103,"Seval");
		}else{
				map.put(103, "Seval");
		}
				boolean contains=map.containsValue("Seval");
				System.out.println(contains);
				System.out.println(map);
			}
	}
	}


